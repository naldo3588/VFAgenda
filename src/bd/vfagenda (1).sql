-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 21-Fev-2017 às 23:52
-- Versão do servidor: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vfagenda`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cad_contato`
--

CREATE TABLE `cad_contato` (
  `id_contato` int(11) NOT NULL,
  `nome` text NOT NULL,
  `data_nasc` text NOT NULL,
  `endereco` text NOT NULL,
  `bairro` text NOT NULL,
  `cep` text NOT NULL,
  `cidade` text NOT NULL,
  `estado` text NOT NULL,
  `pais` text NOT NULL,
  `telefone` text NOT NULL,
  `fax` text NOT NULL,
  `celular` text NOT NULL,
  `email` text NOT NULL,
  `skype` text NOT NULL,
  `site` text NOT NULL,
  `observacao` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cad_contato`
--

INSERT INTO `cad_contato` (`id_contato`, `nome`, `data_nasc`, `endereco`, `bairro`, `cep`, `cidade`, `estado`, `pais`, `telefone`, `fax`, `celular`, `email`, `skype`, `site`, `observacao`) VALUES
(9, 'Ronaldo Pedro Chaves', '0000-00-00', 'Rua L, 1152W', 'Jardim Buritis', '78300000', 'Tangara da Serra', 'Mato Grosso', 'Brasil', '6533251111', '', '65996407733', 'ti@viafertil.com.br', 'ti.viafertil.com.br', 'www.viafertil.com.br', 'Rapaz que é responsavel pela TI'),
(10, 'a', '22/02/2017', '', '', '', '', 'Selecione', '', '', '', '', '', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cad_contato`
--
ALTER TABLE `cad_contato`
  ADD PRIMARY KEY (`id_contato`),
  ADD KEY `id_contato` (`id_contato`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cad_contato`
--
ALTER TABLE `cad_contato`
  MODIFY `id_contato` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
