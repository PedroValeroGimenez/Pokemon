-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-05-2022 a las 14:52:05
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pokemon`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrenador`
--

CREATE TABLE `entrenador` (
  `Nombre` varchar(22) NOT NULL,
  `Pokedollars` int(11) NOT NULL,
  `ID_Entrenador` int(11) NOT NULL,
  `Caja` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `entrenador`
--

INSERT INTO `entrenador` (`Nombre`, `Pokedollars`, `ID_Entrenador`, `Caja`) VALUES
('Entrenador', 2000, 0, 0),
('Rival', 1500, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `imagenes`
--

CREATE TABLE `imagenes` (
  `ID_Pokemon` int(11) NOT NULL,
  `Cara` mediumblob NOT NULL,
  `Espalda` mediumblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movataque`
--

CREATE TABLE `movataque` (
  `Nombre` varchar(22) NOT NULL,
  `Tipo` varchar(22) NOT NULL,
  `Potencia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `movataque`
--

INSERT INTO `movataque` (`Nombre`, `Tipo`, `Potencia`) VALUES
('Ascuas', 'Fuego', 40),
('Burbuja', 'Agua', 40),
('Vuelo', 'Volador', 90),
('Ala de Acero', 'Acero', 70),
('Llamarada', 'Fuego', 110),
('Derribo', 'Normal', 90),
('Colmillo Fuego', 'Fuego', 65),
('Hiperrayo', 'Normal', 150);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movestado`
--

CREATE TABLE `movestado` (
  `Nombre` varchar(22) NOT NULL,
  `Tipo` varchar(22) NOT NULL,
  `Estado` varchar(22) NOT NULL,
  `Turnos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `movestado`
--

INSERT INTO `movestado` (`Nombre`, `Tipo`, `Estado`, `Turnos`) VALUES
('Somnífero', 'Planta', 'Dormido', 2),
('Paralizador', 'Electrico', 'Paralizar', 3),
('LLamarada', 'Fuego', 'Quemado', 2),
('Tóxico', 'Veneno', 'Envenenado', 3),
('Maldición', 'Fantasma', 'Maldito', 4),
('Hidropulso', 'Agua', 'Confuso', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movmejora`
--

CREATE TABLE `movmejora` (
  `Nombre` varchar(22) NOT NULL,
  `Tipo` varchar(22) NOT NULL,
  `Mejora` varchar(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `movmejora`
--

INSERT INTO `movmejora` (`Nombre`, `Tipo`, `Mejora`) VALUES
('Danza Espada', 'Normal', 'Ataque'),
('Rizo Defebnsa', 'Normal', 'Defensa'),
('Defensa Ferrea', 'Acero', 'Defensa'),
('Pantalla Luz', 'Psíquico', 'Def.Esp'),
('Danza Aleteo', 'Bicho', 'Velocidad'),
('Rompecoraza', 'Normal', 'Ataque');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokemon`
--

CREATE TABLE `pokemon` (
  `Nombre` varchar(22) NOT NULL,
  `Tipo` varchar(22) NOT NULL,
  `Ataque` int(11) NOT NULL,
  `Defensa` int(11) NOT NULL,
  `At.Esp` int(11) NOT NULL,
  `Def.Esp` int(11) NOT NULL,
  `Velocidad` int(11) NOT NULL,
  `Vitalidad` int(11) NOT NULL,
  `Nivel` int(11) NOT NULL,
  `ID_Pokemon` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pokemon`
--

INSERT INTO `pokemon` (`Nombre`, `Tipo`, `Ataque`, `Defensa`, `At.Esp`, `Def.Esp`, `Velocidad`, `Vitalidad`, `Nivel`, `ID_Pokemon`) VALUES
('Charmander', 'Fuego', 52, 43, 60, 50, 65, 39, 100, 4),
('Bulbasaur', 'Planta', 49, 49, 65, 65, 45, 45, 100, 1),
('Squirtle', 'Agua', 48, 65, 50, 64, 43, 44, 100, 7),
('Butterfree', 'Bicho', 45, 50, 90, 80, 70, 60, 100, 12),
('Pidgeot', 'Volador', 80, 75, 70, 70, 101, 83, 100, 18),
('Alakazam', 'Psiquico', 50, 45, 135, 95, 120, 55, 100, 65),
('Gengar', 'Fantasma', 65, 60, 130, 75, 110, 60, 100, 94),
('Snorlax', 'Normal', 110, 65, 65, 110, 30, 160, 100, 143),
('Dragonite', 'Dragon', 134, 95, 100, 100, 80, 91, 100, 149),
('Typhlosion', 'Fuego', 84, 78, 109, 85, 100, 78, 100, 157);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
