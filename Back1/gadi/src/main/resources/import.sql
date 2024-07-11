-- ROLES --
INSERT INTO `rol` (`id_rol`, `nombre_rol`) VALUES (NULL, 'Coordinador');
INSERT INTO `rol` (`id_rol`, `nombre_rol`) VALUES (NULL, 'Director');
INSERT INTO `rol` (`id_rol`, `nombre_rol`) VALUES (NULL, 'Docente');
INSERT INTO `rol` (`id_rol`, `nombre_rol`) VALUES (NULL, 'Administrador');


-- GRADO OCUPACIONAL --
INSERT INTO `grado_ocupacional` (`id_grado_ocp`, `nombre_grado_ocp`) VALUES (NULL, 'S1');
INSERT INTO `grado_ocupacional` (`id_grado_ocp`, `nombre_grado_ocp`) VALUES (NULL, 'S2');
INSERT INTO `grado_ocupacional` (`id_grado_ocp`, `nombre_grado_ocp`) VALUES (NULL, 'S3');
INSERT INTO `grado_ocupacional` (`id_grado_ocp`, `nombre_grado_ocp`) VALUES (NULL, 'S4');
INSERT INTO `grado_ocupacional` (`id_grado_ocp`, `nombre_grado_ocp`) VALUES (NULL, 'S5');
INSERT INTO `grado_ocupacional` (`id_grado_ocp`, `nombre_grado_ocp`) VALUES (NULL, 'S6');

-- Tipo Contratos --
INSERT INTO `tipo_contrato`(`nombre_contrato`,`hora_contrato`) VALUES ('TIEMPO COMPLETO',40);
INSERT INTO `tipo_contrato`(`nombre_contrato`,`hora_contrato`) VALUES ('MEDIO TIEMPO',20);
INSERT INTO `tipo_contrato`(`nombre_contrato`,`hora_contrato`) VALUES ('TIEMPO PARCIAL',NULL);

-- PERSONAS --
INSERT INTO `persona` (`edad`, `fecha_vinculacion`, `id_grado_ocp`, `id_persona`, `id_tipo_contrato`, `apellido1`, `apellido2`, `cedula`, `correo`, `direccion`, `nombre1`, `nombre2`, `telefono`) VALUES ('21', '2024-06-04 20:15:08.000000', '1', NULL, '1',  'Sanchez', 'Medina', '1104337389', 'kevin@gmail.com', 'kmdckd', 'Kevin', 'Alexander', '099363846');
INSERT INTO `persona` (`edad`, `fecha_vinculacion`, `id_grado_ocp`, `id_persona`, `id_tipo_contrato`, `apellido1`, `apellido2`, `cedula`, `correo`, `direccion`, `nombre1`, `nombre2`, `telefono`) VALUES ('21', '2024-06-04 20:15:08.000000', '1', NULL, '2',  'Leon', 'Marquez', '0107971244', 'edisson@gmail.com', 'kmdckd', 'Edisson', 'Fabian', '099363846');
INSERT INTO `persona` (`edad`, `fecha_vinculacion`, `id_grado_ocp`, `id_persona`, `id_tipo_contrato`, `apellido1`, `apellido2`, `cedula`, `correo`, `direccion`, `nombre1`, `nombre2`, `telefono`) VALUES ('21', '2024-06-04 20:15:08.000000', '1', NULL, '3',  'Medina', 'Maldonado', '1234567890', 'jean@gmail.com', 'kmdckd', 'Jean', 'Sebastian', '099363846');

-- TIPO DE ACTIVIDADES --
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ('Administrativas');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ('Jefes');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ('Operativas');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ('Gerenciales');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ('Financieras');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ('Marketing');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ('Recursos Humanos');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ('Logística');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ('Compras');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ('Ventas');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ( 'Atención al Cliente');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ( 'Investigación y Desarrollo');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ('Producción');
INSERT INTO `tipo_actividad`(`nom_tip_actividad`) VALUES ('Calidad');


-- CARRERAS REGISTRADAS --
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 1, 'TUDS', 'TECNOLOGÍA SUPERIOR UNIVERSITARIA EN DESARROLLO DE SOFTWARE');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 2, 'TDS', 'TECNOLOGÍA SUPERIOR EN DESARROLLO DE SOFTWARE');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 3, 'TSBG', 'TECNOLOGÍA SUPERIOR EN BIG DATA');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 4, 'TSCS', 'TECNOLOGIA SUPERIOR EN CIBERSEGURIDAD');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 5, 'TSMI', 'TECNOLOGÍA SUPERIOR EN MECÁNICA INDUSTRIAL');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 6, 'TDI', 'TECNOLOGÍA EN DESARROLLO INFANTIL INTEGRAL');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 7, 'TSED', 'ENTRENAMIENTO DEPORTIVO');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 8, 'TSPIM', 'TECNOLOGÍA SUPERIOR EN PROCESAMIENTO INDUSTRIAL DE LA MADERA');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 9, 'TSE', 'TECNOLOGÍA SUPERIOR EN ELECTRICIDAD');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 10, 'TSP', 'TECNOLOGÍA SUPERIOR EN SEGURIDAD PENITENCIARIA');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 11, 'TSAF', 'TECNOLOGÍA SUPERIOR EN ASESORÍA FINANCIERA');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 12, 'TSCI', 'TECNOLOGÍA SUPERIOR EN CONTROL DE INCENDIOS Y OPERACIONES DE RESCATE');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 13, 'TSM', 'TECNOLOGÍA SUPERIOR EN MECATRÓNICA');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 14, 'TST', 'TECNOLOGÍA SUPERIOR EN TRIBUTACIÓN');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 15, 'TSCO', 'TECNOLOGÍA SUPERIOR EN SEGURIDAD CIUDADANA Y ORDEN PÚBLICO');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 16, 'TSPRL', 'TECNOLOGÍA SUPERIOR EN SEGURIDAD Y PREVENCIÓN DE RIESGOS LABORALES');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 17, 'TSGPHC', 'TECNOLOGÍA SUPERIOR EN GESTIÓN DEL PATRIMONIO HISTÓRICO CULTURAL');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 18, 'TPRA', 'PRODUCCIÓN Y REALIZACIÓN AUDIOVISUAL');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 19, 'TSMCI', 'TECNOLOGÍA SUPERIOR EN MANTENIMIENTO ELÉCTRICO Y CONTROL INDUSTRIAL');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 20, 'TSMIN', 'TECNOLOGÍA SUPERIOR UNIVERSITARIA EN MANTENIMIENTO INDUSTRIAL');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 21, 'TSMM', 'TECNOLOGÍA SUPERIOR EN METALMECÁNICA');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 22, 'TSAIPT', 'TECNOLOGÍA SUPERIOR EN ADMINISTRACIÓN DE INFRAESTRUCTURA Y PLATAFORMAS TECNOLÓGICAS');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 23, 'EC', 'EDUCACIÓN CONTÍNUA');
INSERT INTO `carrera` (`horas_semanales`, `fecha_inicio`, `id_carrera`, `codigo`, `nombre_carrera`) VALUES (30, '2024-06-01', 24, 'TAS', 'TECNOLOGÍA EN ANÁLISIS DE SISTEMAS');

--- Ingresar Ciclos ---
INSERT INTO `ciclo`(`id_ciclo`, `nombre_ciclo`) VALUES (NULL,'PRIMERO');
INSERT INTO `ciclo`(`id_ciclo`, `nombre_ciclo`) VALUES (NULL,'SEGUNDO');
INSERT INTO `ciclo`(`id_ciclo`, `nombre_ciclo`) VALUES (NULL,'TERCERO');
INSERT INTO `ciclo`(`id_ciclo`, `nombre_ciclo`) VALUES (NULL,'CUARTO');
INSERT INTO `ciclo`(`id_ciclo`, `nombre_ciclo`) VALUES (NULL,'QUINTO');
INSERT INTO `ciclo`(`id_ciclo`, `nombre_ciclo`) VALUES (NULL,'SEXTO');

-- ASIGNATURAS REGISTRADAS TDS 1 --

INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('4',NULL,'2','1','Matemática Discreta');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('3',NULL,'2','1','Desarrollo de Pensamiento');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('5',NULL,'2','1','Introducción al Desarrollo de Software');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('7',NULL,'2','1','Fundamentos de Programación');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('6',NULL,'2','1','Análisis y Diseño de Sistemas');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('5',NULL,'2','1','Inglés 1');

-- ASIGNATURAS REGISTRADAS TDS 2 --

INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('4',NULL,'2','2','Algebra y Trigonometría');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('7',NULL,'2','2','Base de Datos');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('7',NULL,'2','2','Programación Orientada a Objetos');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('4',NULL,'2','2','Metodologías de Desarrollo de Software');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('3',NULL,'2','2','Lenguaje y Comunicación');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('5',NULL,'2','2','Inglés 2');

-- ASIGNATURAS REGISTRADAS TDS 3 --

INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('4',NULL,'2','3','Calculo Diferencial e Integral');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('3',NULL,'2','3','Fundamentos de Administración');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('6',NULL,'2','3','Programación Visual');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('6',NULL,'2','3','Base de Datos Avanzada');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('5',NULL,'2','3','Diseño de Interfaz');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('5',NULL,'2','3','Inglés 3');

-- ASIGNATURAS REGISTRADAS TDS 4 --

INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('4',NULL,'2','4','Estadística Descriptiva');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('4',NULL,'2','4','Legislación Informática');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('8',NULL,'2','4','Programación de Aplicaciones Web');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('7',NULL,'2','4','Desarrollo de Aplicaciones Móviles');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'2','4','Diversidad y Cultura');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('5',NULL,'2','4','Inglés 4');

-- ASIGNATURAS REGISTRADAS TDS 5 --

INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('4',NULL,'2','5','Emprendimiento');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'2','5','Proyecto de Titulación');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('9',NULL,'2','5','Tendencias Actuales de Programación');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('6',NULL,'2','5','Calidad del Software');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('7',NULL,'2','5','Fundamentos de Redes y Conectividad');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'2','5','Ética profesional');

-- ASIGNATURAS REGISTRADAS TUDS 1 --

INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('4',NULL,'1','1','Aplicaciones en la nube');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'1','1','Patrones de diseño');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('9',NULL,'1','1','Aplicaciones seguras');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('6',NULL,'1','1','Proyectos tecnológicos');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('7',NULL,'1','1','Inteligencia artificial');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'1','1','Programación orientada a objetos');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'1','1','Formulación de proyectos - Titulación');



-- AIGNATURAS REGISTRADAS TSBG 1 --
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'3','1','Introducción a Big Data');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'3','1','Ofimática');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'3','1','Introducción a la programación');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'3','1','Matemática');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'3','1','Fundamentos de estadística');


--ASIGNATURAS REGISTRADAS TSCS 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'4','1','Fundamentos de Ciberseguridad');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'4','1','Sistemas Operativos');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'4','1','Ofimática');

--ASIGNATURAS REGISTRADAS TSMI 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'5','1','Fundamentos de estadística');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'5','1','Fundamentos de estadística');

--ASIGNATURAS REGISTRADAS TDI 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'6','2','Estimulación temprana II');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'6','2','Comunicación acertiva');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'6','2','Salud y Nutrición');

--ASIGNATURAS REGISTRADAS TSED 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'7','1','Estadística básica');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'7','1','Expresión oral y escrita');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'7','1','Anatomía del deporte');

--ASIGNATURAS REGISTRADAS TSPIM 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'8','4','Herramientas, máquinas y equipos III');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'8','4','Tecnología de la construcción');

--ASIGNATURAS REGISTRADAS TSE 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'9','5','Energias alternativas');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'9','5','Sistemas de distribución eléctrica');

--ASIGNATURAS REGISTRADAS TSP 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'10','1','Ética y relaciones humanas');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'10','1','Introducción penitenciaria');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'10','1','Teorías de la seguridad');

--ASIGNATURAS REGISTRADAS TSAF 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'11','5','Seguros');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'11','5','Banca electrónica y canales de distribución alternativo');

--ASIGNATURAS REGISTRADAS TSCI 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'12','4','Atención prehospitalaria II');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'12','4','Ciencias del Fuego');

--ASIGNATURAS REGISTRADAS TSM 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'13','1','Creación de negocios');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'13','1','Seguridad industrial y salud ocupacional');

--ASIGNATURAS REGISTRADAS TST 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'14','1','Informática Tributaria');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'14','1','Contabilidad mercantil');

--ASIGNATURAS REGISTRADAS TSCO 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'15','6','Doctrina policial I');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'15','6','Seguridad humana y seguridad ciudadana');

--ASIGNATURAS REGISTRADAS TSPRL 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'16','2','Electricidad, magnetismo y radiación');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'16','2','Estadística y probabilidades');

--ASIGNATURAS REGISTRADAS TSGPHC 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'17','1','Ofimática');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'17','1','Patrimonio material e inmaterial');

--ASIGNATURAS REGISTRADAS TPRA 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'18','2','Dirección de fotografía');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'18','2','Técnicas de realización audiovisual');

--ASIGNATURAS REGISTRADAS TSMCI 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'19','2','Gestión de la seguridad industrial');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'19','2','Electrónica digital');

--ASIGNATURAS REGISTRADAS TSMIN 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'20','1','Reparación de elemntos industriales');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'20','1','Atomatización industrial');

--ASIGNATURAS REGISTRADAS TSMM 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'21','2','Metalmecánica');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'21','2','Soldadura');

--ASIGNATURAS REGISTRADAS TSAIPT 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'22','1','Redes de datos I');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'22','1','Sistemas Operativos I');

--ASIGNATURAS REGISTRADAS EC 1--
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2',NULL,'23','1','Excel Intermedio');

--- Periodos academicos---
INSERT INTO `periodo`(`fin_periodo`, `id_periodo`, `inicio_periodo`, `nombre_periodo`) VALUES ('2024-12-31', '1', '2024-01-01', 'Periodo 2024');
INSERT INTO `periodo`(`fin_periodo`, `id_periodo`, `inicio_periodo`, `nombre_periodo`)  VALUES ('2025-12-31', '2', '2025-01-01', 'Periodo 2025');
INSERT INTO `periodo`(`fin_periodo`, `id_periodo`, `inicio_periodo`, `nombre_periodo`)  VALUES ('2026-12-31', '3', '2026-01-01', 'Periodo 2026');

--JORNADAS ACADEMICAS ---
INSERT INTO `jornada`(`id_jornada`, `descrip_jornada`)  VALUES ('1', 'Matutina');
INSERT INTO `jornada`(`id_jornada`, `descrip_jornada`)  VALUES ('2', 'Vespertina');
INSERT INTO `jornada`(`id_jornada`, `descrip_jornada`)  VALUES ('3', 'Nocturna');

INSERT INTO `distributivo` (`id_distributivo`, `id_periodo`, `id_persona`, `estado`) VALUES (NULL, '1', '1', 'Aceptado');
INSERT INTO `distributivo` (`id_distributivo`, `id_periodo`, `id_persona`, `estado`) VALUES (NULL, '2', '2', 'Aceptado');

INSERT INTO `usuario` (`id_carrera`, `id_persona`, `id_usuario`, `contrasena`, `usuario`) VALUES ('1', '1', NULL, '$2a$10$I0u5UeJ9poZIvu1b9Wevg./z5cQc3bWXkY0c1eh5VEl2waT3V6ANC', 'kevin');
INSERT INTO `usuario` (`id_carrera`, `id_persona`, `id_usuario`, `contrasena`, `usuario`) VALUES ('2', '2', NULL, '$2a$10$I0u5UeJ9poZIvu1b9Wevg./z5cQc3bWXkY0c1eh5VEl2waT3V6ANC', 'edisson')
INSERT INTO `usuario` (`id_carrera`, `id_persona`, `id_usuario`, `contrasena`, `usuario`) VALUES ('3', '3', NULL, '$2a$10$I0u5UeJ9poZIvu1b9Wevg./z5cQc3bWXkY0c1eh5VEl2waT3V6ANC', 'jean');
---USUARIO MASTER ---
INSERT INTO `usuario_rol` (`id_rol`, `id_usuario`, `id_usuario_rol`) VALUES ('1', '1', NULL);
INSERT INTO `usuario_rol` (`id_rol`, `id_usuario`, `id_usuario_rol`) VALUES ('2', '1', NULL);
INSERT INTO `usuario_rol` (`id_rol`, `id_usuario`, `id_usuario_rol`) VALUES ('3', '1', NULL);
---USUARIOS CON ROL --
INSERT INTO `usuario_rol` (`id_rol`, `id_usuario`, `id_usuario_rol`) VALUES ('1', '2', NULL);
INSERT INTO `usuario_rol` (`id_rol`, `id_usuario`, `id_usuario_rol`) VALUES ('2', '2', NULL);
INSERT INTO `usuario_rol` (`id_rol`, `id_usuario`, `id_usuario_rol`) VALUES ('1', '3', NULL);
INSERT INTO `usuario_rol` (`id_rol`, `id_usuario`, `id_usuario_rol`) VALUES ('2', '3', NULL);
INSERT INTO `usuario_rol` (`id_rol`, `id_usuario`, `id_usuario_rol`) VALUES ('4', '1', NULL);

--Actividades--
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('5', NULL, '1', 'Organización de documentos y reuniones administrativas', 'Administración');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('8', NULL, '2', 'Coordinación de equipos y toma de decisiones estratégicas', 'Gestión de Jefes');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('7', NULL, '3', 'Ejecución de tareas operativas diarias', 'Operaciones');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('6', NULL, '4', 'Supervisión de equipos y planificación gerencial', 'Gerencia');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('9', NULL, '5', 'Análisis financiero y gestión de presupuestos', 'Finanzas');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('5', NULL, '6', 'Desarrollo de estrategias de marketing y publicidad', 'Marketing');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('4', NULL, '7', 'Gestión de personal y desarrollo organizacional', 'Recursos Humanos');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('6', NULL, '8', 'Coordinación y gestión de la cadena de suministro', 'Logística');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('7', NULL, '9', 'Proceso de adquisición de bienes y servicios', 'Compras');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('8', NULL, '10', 'Desarrollo y ejecución de estrategias de ventas', 'Ventas');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('5', NULL, '11', 'Atención y resolución de consultas de clientes', 'Atención al Cliente');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('10', NULL, '12', 'Desarrollo de nuevos productos e innovaciones', 'Investigación y Desarrollo');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('8', NULL, '13', 'Fabricación y ensamblaje de productos', 'Producción');
INSERT INTO `actividad` (`horas_no_docentes`, `id_actividad`, `id_tipo_actividad`, `descripcion_actividad`, `nombre_actividad`) VALUES ('6', NULL, '14', 'Inspección y aseguramiento de la calidad', 'Control de Calidad');


INSERT INTO `distributivo_actividad` (`hora_no_docente`, `id_actividad`, `id_distributivo`, `id_distributivo_actividad`) VALUES ('12', '1', '1', NULL);
INSERT INTO `distributivo_actividad` (`hora_no_docente`, `id_actividad`, `id_distributivo`, `id_distributivo_actividad`) VALUES ('12', '2', '2', NULL);
INSERT INTO `distributivo_actividad` (`hora_no_docente`, `id_actividad`, `id_distributivo`, `id_distributivo_actividad`) VALUES ('12', '2', '2', NULL);

INSERT INTO `distributivo_asignatura` (`id_asignatura`, `id_distributivo`, `id_distributivo_asig`, `id_jornada`, `paralelo`) VALUES ('1', '1', NULL, '1', 'A');
INSERT INTO `distributivo_asignatura` (`id_asignatura`, `id_distributivo`, `id_distributivo_asig`, `id_jornada`, `paralelo`) VALUES ('2', '1', NULL, '1', 'A');
INSERT INTO `distributivo_asignatura` (`id_asignatura`, `id_distributivo`, `id_distributivo_asig`, `id_jornada`, `paralelo`) VALUES ('2', '2', NULL, '1', 'A');
