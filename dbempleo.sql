CREATE DATABASE examen1;
USE examen1;
CREATE TABLE `empleado` (
  `idEmpleado` int(10) NOT NULL,
  `Apellidos` varchar(30) NOT NULL,
  `Nombres` varchar(20) NOT NULL,
  `Edad` int(12) NOT NULL,
  `Sexo` varchar(12) NOT NULL,
  `Salario` double NOT NULL);
  
INSERT INTO `empleado` (`idEmpleado`, `Apellidos`, `Nombres`, `Edad`, `Sexo`, `Salario`) VALUES
(1, 'Arica', 'Kevin', 22, 'Masculino', 2000),
(2, 'Ramos', 'Agustin', 24, 'Masculino', 3000),
(3, 'Prieto', 'Luis', 22, 'Masculino', 4000);

ALTER TABLE `empleado`
  ADD PRIMARY KEY (`idEmpleado`);
  
  ALTER TABLE `empleado`
  MODIFY `IdEmpleado` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;



  