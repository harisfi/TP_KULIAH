-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 07, 2021 at 11:35 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tambakside`
--

-- --------------------------------------------------------

--
-- Table structure for table `GoodsShipment`
--

CREATE TABLE `GoodsShipment` (
  `kode` varchar(16) NOT NULL,
  `kode_surat_brg_keluar` varchar(17) NOT NULL,
  `kode_pelanggan` varchar(17) NOT NULL,
  `kode_barang` varchar(17) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Inventory`
--

CREATE TABLE `Inventory` (
  `kode` varchar(17) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Inventory`
--

INSERT INTO `Inventory` (`kode`, `nama`, `jumlah`, `harga`) VALUES
('BRG20210407162011', 'Ikan Bandeng', 300, 120000),
('BRG20210407162012', 'Ikan Mas', 500, 30000),
('BRG20210407162013', 'Udang Windu', 400, 80000),
('BRG20210407162014', 'Lobster', 200, 300000),
('BRG20210407162015', 'Kepiting', 350, 250000);

-- --------------------------------------------------------

--
-- Table structure for table `Pelanggan`
--

CREATE TABLE `Pelanggan` (
  `kode` varchar(17) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `telp` varchar(13) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Pelanggan`
--

INSERT INTO `Pelanggan` (`kode`, `nama`, `alamat`, `telp`, `email`) VALUES
('CST20210407121003', 'Haris', 'Sidoarjo', '081627183918', 'haryz@mail.com'),
('CST20210407121005', 'Doni', 'Surabaya', '081728182738', 'dons@mail.com'),
('CST20210407121006', 'Andy', 'Malang', '081019748921', 'andyganteng@mail.com'),
('CST20210407121007', 'Juned', 'Sidoarjo', '081748012094', 'junedwarnet@mail.com');

-- --------------------------------------------------------

--
-- Table structure for table `PurchaseOrder`
--

CREATE TABLE `PurchaseOrder` (
  `kode` varchar(16) NOT NULL,
  `kode_supplier` varchar(17) NOT NULL,
  `kode_barang` varchar(17) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `PurchaseOrder`
--

INSERT INTO `PurchaseOrder` (`kode`, `kode_supplier`, `kode_barang`, `jumlah`, `tanggal`, `keterangan`) VALUES
('PO20210407162502', 'SUP20210407121206', 'BRG20210407162011', 300, '2021-04-07', 'barang fresh'),
('PO20210407162607', 'SUP20210407121207', 'BRG20210407162012', 500, '2021-04-07', 'langsung dari tambak'),
('PO20210407162700', 'SUP20210407121208', 'BRG20210407162013', 400, '2021-04-07', 'udangnya besar-besar'),
('PO20210407162744', 'SUP20210407121209', 'BRG20210407162014', 200, '2021-04-07', NULL),
('PO20210407162821', 'SUP20210407121206', 'BRG20210407162015', 350, '2021-04-07', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `ReturPembelian`
--

CREATE TABLE `ReturPembelian` (
  `kode` varchar(16) NOT NULL,
  `kode_purchase_order` varchar(16) NOT NULL,
  `kode_barang` varchar(17) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `ReturPenjualan`
--

CREATE TABLE `ReturPenjualan` (
  `kode` varchar(16) NOT NULL,
  `kode_sales_order` varchar(16) NOT NULL,
  `kode_barang` varchar(17) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `SalesOrder`
--

CREATE TABLE `SalesOrder` (
  `kode` varchar(16) NOT NULL,
  `kode_pelanggan` varchar(17) NOT NULL,
  `kode_barang` varchar(17) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Supplier`
--

CREATE TABLE `Supplier` (
  `kode` varchar(17) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `telp` varchar(13) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Supplier`
--

INSERT INTO `Supplier` (`kode`, `nama`, `alamat`, `telp`, `email`) VALUES
('SUP20210407121206', 'Firman', 'Pasuruan', '081627183918', 'firmanss@mail.com'),
('SUP20210407121207', 'Bagas', 'Gresik', '081728182738', 'bagasyooo@mail.com'),
('SUP20210407121208', 'Kirun', 'Mojokerto', '081019748921', 'ketoprak@mail.com'),
('SUP20210407121209', 'Endog', 'Lamongan', '081748012094', 'endogg@mail.com');

-- --------------------------------------------------------

--
-- Table structure for table `SuratBarangKeluar`
--

CREATE TABLE `SuratBarangKeluar` (
  `kode` varchar(17) NOT NULL,
  `kode_sales_order` varchar(16) NOT NULL,
  `kode_barang` varchar(17) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `SuratBarangMasuk`
--

CREATE TABLE `SuratBarangMasuk` (
  `kode` varchar(17) NOT NULL,
  `kode_purchase_order` varchar(16) NOT NULL,
  `kode_barang` varchar(17) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `SuratBarangMasuk`
--

INSERT INTO `SuratBarangMasuk` (`kode`, `kode_purchase_order`, `kode_barang`, `jumlah`, `tanggal`) VALUES
('SBM20210407163129', 'PO20210407162502', 'BRG20210407162011', 300, '2021-04-07'),
('SBM20210407163201', 'PO20210407162607', 'BRG20210407162012', 500, '2021-04-07'),
('SBM20210407163236', 'PO20210407162700', 'BRG20210407162013', 400, '2021-04-07'),
('SBM20210407163312', 'PO20210407162744', 'BRG20210407162014', 200, '2021-04-07'),
('SBM20210407163345', 'PO20210407162821', 'BRG20210407162015', 350, '2021-04-07');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `GoodsShipment`
--
ALTER TABLE `GoodsShipment`
  ADD PRIMARY KEY (`kode`),
  ADD KEY `kode_surat_brg_keluar` (`kode_surat_brg_keluar`),
  ADD KEY `kode_pelanggan` (`kode_pelanggan`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `Inventory`
--
ALTER TABLE `Inventory`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `Pelanggan`
--
ALTER TABLE `Pelanggan`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `PurchaseOrder`
--
ALTER TABLE `PurchaseOrder`
  ADD PRIMARY KEY (`kode`),
  ADD KEY `kode_supplier` (`kode_supplier`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `ReturPembelian`
--
ALTER TABLE `ReturPembelian`
  ADD PRIMARY KEY (`kode`),
  ADD KEY `kode_purchase_order` (`kode_purchase_order`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `ReturPenjualan`
--
ALTER TABLE `ReturPenjualan`
  ADD PRIMARY KEY (`kode`),
  ADD KEY `kode_sales_order` (`kode_sales_order`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `SalesOrder`
--
ALTER TABLE `SalesOrder`
  ADD PRIMARY KEY (`kode`),
  ADD KEY `kode_pelanggan` (`kode_pelanggan`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `Supplier`
--
ALTER TABLE `Supplier`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `SuratBarangKeluar`
--
ALTER TABLE `SuratBarangKeluar`
  ADD PRIMARY KEY (`kode`),
  ADD KEY `kode_sales_order` (`kode_sales_order`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `SuratBarangMasuk`
--
ALTER TABLE `SuratBarangMasuk`
  ADD PRIMARY KEY (`kode`),
  ADD KEY `kode_purchase_order` (`kode_purchase_order`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `GoodsShipment`
--
ALTER TABLE `GoodsShipment`
  ADD CONSTRAINT `GoodsShipment_ibfk_1` FOREIGN KEY (`kode_surat_brg_keluar`) REFERENCES `SuratBarangKeluar` (`kode`),
  ADD CONSTRAINT `GoodsShipment_ibfk_2` FOREIGN KEY (`kode_pelanggan`) REFERENCES `Pelanggan` (`kode`),
  ADD CONSTRAINT `GoodsShipment_ibfk_3` FOREIGN KEY (`kode_barang`) REFERENCES `Inventory` (`kode`);

--
-- Constraints for table `PurchaseOrder`
--
ALTER TABLE `PurchaseOrder`
  ADD CONSTRAINT `PurchaseOrder_ibfk_1` FOREIGN KEY (`kode_supplier`) REFERENCES `Supplier` (`kode`),
  ADD CONSTRAINT `PurchaseOrder_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `Inventory` (`kode`);

--
-- Constraints for table `ReturPembelian`
--
ALTER TABLE `ReturPembelian`
  ADD CONSTRAINT `ReturPembelian_ibfk_1` FOREIGN KEY (`kode_purchase_order`) REFERENCES `PurchaseOrder` (`kode`),
  ADD CONSTRAINT `ReturPembelian_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `Inventory` (`kode`);

--
-- Constraints for table `ReturPenjualan`
--
ALTER TABLE `ReturPenjualan`
  ADD CONSTRAINT `ReturPenjualan_ibfk_1` FOREIGN KEY (`kode_sales_order`) REFERENCES `SalesOrder` (`kode`),
  ADD CONSTRAINT `ReturPenjualan_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `Inventory` (`kode`);

--
-- Constraints for table `SalesOrder`
--
ALTER TABLE `SalesOrder`
  ADD CONSTRAINT `SalesOrder_ibfk_1` FOREIGN KEY (`kode_pelanggan`) REFERENCES `Pelanggan` (`kode`),
  ADD CONSTRAINT `SalesOrder_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `Inventory` (`kode`);

--
-- Constraints for table `SuratBarangKeluar`
--
ALTER TABLE `SuratBarangKeluar`
  ADD CONSTRAINT `SuratBarangKeluar_ibfk_1` FOREIGN KEY (`kode_sales_order`) REFERENCES `SalesOrder` (`kode`),
  ADD CONSTRAINT `SuratBarangKeluar_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `Inventory` (`kode`);

--
-- Constraints for table `SuratBarangMasuk`
--
ALTER TABLE `SuratBarangMasuk`
  ADD CONSTRAINT `SuratBarangMasuk_ibfk_1` FOREIGN KEY (`kode_purchase_order`) REFERENCES `PurchaseOrder` (`kode`),
  ADD CONSTRAINT `SuratBarangMasuk_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `Inventory` (`kode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
