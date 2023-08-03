package com.chen.simpleFactory;

public class ResourceLoader {

    public Resource load(String url){
        //根据rul获取前缀
        String prefix = getPrefix(url);

        Resource resource = null;

        //根据前缀处理不同的资源
        if ("http".equals(prefix)){
            //发起请求，下载资源
            System.out.println("下载请求，下载资源");

            return new Resource(url);
        }else if ("file".equals(prefix)){
            //建立流，做异常处理
             return new Resource(url);

        }else if ("classpath".equals(url)){
            return new Resource(url);
        }else{
            return new Resource("default");
        }



    }

    private String getPrefix(String url) {
        if (url == null || "".equals(url)){
            throw new ResourceLoadException("传入的url不合法");
        }
        String[] split = url.split(":");

        return split[0];
    }
}
