-- 记录表
CREATE TABLE `notebook_data` (
                                 `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
                                 `type` smallint NOT NULL COMMENT '内容类型，1-备忘录；2-记事本',
                                 `date` datetime NOT NULL COMMENT '日期',
                                 `content` TEXT CHARACTER SET utf8mb4 NOT NULL COMMENT '内容',
                                 `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                 `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='记录表';

-- 通讯录表
CREATE TABLE `contact_data` (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
                                `phone_num` varchar(16) NOT NULL COMMENT '电话号码',
                                `person_ch` varchar(255) CHARACTER SET utf8mb4 NOT NULL COMMENT '联系人中文名',
                                `person_en` varchar(255) CHARACTER SET utf8mb4 NOT NULL COMMENT '联系人拼音',
                                `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                `update_time` datetime DEFAULT NULL COMMENT '更新时间',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通讯录表';