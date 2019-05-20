INSERT INTO SECUENCIAS VALUES
('LINEAS_PEDIDO_SEQ',1000),
('CLIENTE_SEQ',1000),
('PEDIDO_SEQ',1000);


INSERT INTO PRODUCTOS VALUES
(1,'café solo', 1.20),
(2,'café con leche', 1.40),
(3,'café cortado', 1.30);

INSERT INTO USUARIOS VALUES
(1,'juanka', 'navarro','hernandez'),
(2,'isma', 'rodrigues','gutierrez'),
(3,'jose', 'pepin','españa');

INSERT INTO PLAZAS VALUES
(1,'SOTANO_1', 'juanka','666666666','jkindutrias@gmail.com',0),
(2,'SOTANO_2', 'isma','999999999','isma@gmail.com',1),
(3,'SOTANO_2', 'jose','555666444','jose@gmail.com',0);

INSERT INTO RESERVAS VALUES
(1,1, 1,'2009-02-12 14:55:00',NULL),
(2,2, 3,NULL,NULL),
(3,3, 2,NULL,NULL);