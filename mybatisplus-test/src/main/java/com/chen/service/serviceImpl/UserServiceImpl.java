package com.chen.service.serviceImpl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.entity.User;
import com.chen.mapper.UserMapper;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private ThreadPoolExecutor threadPoolExecutor;

    @Autowired
    private UserMapper userMapper;

    private Integer pageNo = new Integer(1);

    @Override
    public int updateBatch(List<User> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<User> list) {
        return baseMapper.batchInsert(list);
    }



    @Override
    public Page<User> findByPage(Page<User> userPage) {
        return baseMapper.selectPage(userPage, null);
    }

    @Override
    public void batchInsertByThread() {
        while (true) {
            Page<User> userPage = this.getPage();
            Page<User> selectPage = baseMapper.selectPage(userPage, null);
            if (selectPage.getRecords() == null || selectPage.getRecords().size() == 0) {
                break;
            }

            CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
                for (User user : selectPage.getRecords()) {
                    System.out.println(user.getUserId());
                }
                System.out.println(Thread.currentThread().getName());
                System.out.println(selectPage.getRecords());
                return new Integer(1);
            }, threadPoolExecutor);

            try {
                System.out.println(completableFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

            /*threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getId());

                }
            });*/

//            ExecutorService executorService = Executors.newCachedThreadPool();
//            executorService.execute(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                    System.out.println(Thread.currentThread().getName());
//
//                }
//            });


//        }


        }
    }

    public synchronized Page<User> getPage(){
        return new Page<User>(this.pageNo++,2);
    }

}
