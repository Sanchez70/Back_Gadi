INSERT INTO `rol` (`id_rol`, `nombre_rol`) VALUES (NULL, 'Coordinador');
INSERT INTO `rol` (`id_rol`, `nombre_rol`) VALUES (NULL, 'Director');
INSERT INTO `rol` (`id_rol`, `nombre_rol`) VALUES (NULL, 'Docente');
INSERT INTO `titulo_profesional` (`grado`, `id_titulo_profesional`, `nombre_titulo`) VALUES ('3', NULL, 'Tecnologico');
INSERT INTO `grado_ocupacional` (`id_grado_ocp`, `nombre_grado_ocp`) VALUES (NULL, 'S6');
INSERT INTO `tipo_contrato` (`hora_contrato`, `id_tipo_contrato`, `nombre_contrato`) VALUES ('1', NULL, 'TC');
INSERT INTO `persona` (`edad`, `fecha_vinculacion`, `id_grado_ocp`, `id_persona`, `id_tipo_contrato`, `id_titulo_profesional`, `apellido1`, `apellido2`, `cedula`, `correo`, `direccion`, `nombre1`, `nombre2`, `telefono`) VALUES ('21', '2024-06-04 20:15:08.000000', '1', NULL, '1', '1', 'Sanchez', 'Medina', '1104337389', 'kevin@gmail.com', 'kmdckd', 'Kevin', 'Alexander', '099363846');
INSERT INTO `usuario` (`id_carrera`, `id_persona`, `id_usuario`, `contrasena`, `usuario`) VALUES (NULL, '1', NULL, '123', 'kevin');
INSERT INTO `usuario` (`id_persona`, `id_usuario`, `contrasena`, `usuario`) VALUES (NULL, NULL, '123', 'jean');
INSERT INTO `usuario` (`id_persona`, `id_usuario`, `contrasena`, `usuario`) VALUES (NULL, NULL, '123', 'edisson');
INSERT INTO `usuario_rol` (`id_rol`, `id_usuario`, `id_usuario_rol`) VALUES ('1', '1', NULL);
INSERT INTO `usuario_rol` (`id_rol`, `id_usuario`, `id_usuario_rol`) VALUES ('2', '1', NULL);
INSERT INTO `usuario_rol` (`id_rol`, `id_usuario`, `id_usuario_rol`) VALUES ('3', '2', NULL);

-- TIPO DE ACTIVIDADES --
INSERT INTO `tipo_actividad`(`id_tipo_actividad`, `nom_tip_actividad`) VALUES ('1','Actividad1');
INSERT INTO `tipo_actividad`(`id_tipo_actividad`, `nom_tip_actividad`) VALUES ('2','Actividad2');
INSERT INTO `tipo_actividad`(`id_tipo_actividad`, `nom_tip_actividad`) VALUES ('3','Actividad3');

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
INSERT INTO `ciclo`(`id_ciclo`, `nombre_ciclo`) VALUES ('1','Ciclo 1');
INSERT INTO `ciclo`(`id_ciclo`, `nombre_ciclo`) VALUES ('2','Ciclo 2');
INSERT INTO `ciclo`(`id_ciclo`, `nombre_ciclo`) VALUES ('3','Ciclo 3');
-- ASIGNATURAS REGISTRADAS --
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('3','1','1','1','Matemáticas');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('4','2','1','1','Física');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('2','3','1','1','Química');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('3','4','1','1','Biología');
INSERT INTO `asignatura`(`horas_semanales`, `id_asignatura`, `id_carrera`, `id_ciclo`, `nombre_asignatura`) VALUES ('5','5','1','1','Programación');
