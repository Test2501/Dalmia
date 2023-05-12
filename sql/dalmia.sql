CREATE DATABASE IF NOT EXISTS dalmia;

SELECT * FROM dalmia.user;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `imei` varchar(255) DEFAULT NULL,
  `logged_in` datetime(6) DEFAULT NULL,
  `mobile_make` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `is_active` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
