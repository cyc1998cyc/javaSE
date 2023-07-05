-- auto Generated on 2023-07-04
-- DROP TABLE IF EXISTS t_area;
CREATE TABLE t_area(
  id VARCHAR (50) NOT NULL COMMENT 'id',
  area_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'areaName',
  parent_id VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'parentId',
  parent_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'parentName',
  `level` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'level',
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 't_area';
