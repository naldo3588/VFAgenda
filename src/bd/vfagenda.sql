-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 27-Fev-2017 às 03:41
-- Versão do servidor: 10.1.13-MariaDB
-- PHP Version: 5.5.35

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
  `observacao` text NOT NULL,
  `usuario` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cad_contato`
--

INSERT INTO `cad_contato` (`id_contato`, `nome`, `data_nasc`, `endereco`, `bairro`, `cep`, `cidade`, `estado`, `pais`, `telefone`, `fax`, `celular`, `email`, `skype`, `site`, `observacao`, `usuario`) VALUES
(19, 'asfasfasfas', '16/02/2017', 'asdfasfas', 'asfasdf', 'asfasfas', 'asfsadfas', 'Amapá', 'asdfasdfa', 'asdfasf', 'asdfsadfas', 'dasfasdfas', 'dfsadfsafas', 'dfasdfas', 'dfasfas', 'fsafsadfasfas', 'ronaldo'),
(20, 'asdfewrwer wwcgfdfgcvbcvb', '17/02/2017', 'cvbxcbxc', 'xcvbxcbcx', 'vbcxbxc', 'bcxbcx', 'Amapá', 'bxcbxcbcx', 'bcxvbcx', 'bcxv', 'bcxvbxcvb', 'xcbcxvbcx', 'bxcbxcb', 'cxvbxcb', 'xcbvcxvbxcvbcxv', 'ronaldo'),
(21, 'wexcvxcvxcvxcvxc', '23/02/2017', 'xcvxcvx', 'cvxcv', 'xcvxcv', 'xcvxcvx', 'Amazonas', 'xcvxcvxc', 'vxcvx', 'cvxcv', 'xcvxcvxcvxc', 'vxcvxcvxc', 'vxcvxc', 'vxcvxcvxcvxcvxc', 'vxcvxcvxcvxc', 'ronaldo'),
(22, '435325235', '09/02/2017', '23523', '535', '35345325', '235235', 'Alagoas', '235235', '23523', '523', '523523', '523523532532532', '32532', '452353252', '532452345', 'higor');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nome` text NOT NULL,
  `login` text NOT NULL,
  `senha` text NOT NULL,
  `ativo` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nome`, `login`, `senha`, `ativo`) VALUES
(1, 'Ronaldo Pedro', 'ronaldo', '12345', 1),
(2, 'Higor Luis', 'higor', '12345', 1);

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
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cad_contato`
--
ALTER TABLE `cad_contato`
  MODIFY `id_contato` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
