-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 28, 2019 at 05:30 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ontaptv`
--

-- --------------------------------------------------------

--
-- Table structure for table `dapan`
--

CREATE TABLE `dapan` (
  `MaDe` varchar(200) NOT NULL,
  `MaDapAn` int(11) NOT NULL,
  `CauHoi` varchar(500) NOT NULL,
  `TraLoi1` varchar(500) NOT NULL,
  `TraLoi2` varchar(500) NOT NULL,
  `TraLoi3` varchar(500) NOT NULL,
  `DapAn` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dapan`
--

INSERT INTO `dapan` (`MaDe`, `MaDapAn`, `CauHoi`, `TraLoi1`, `TraLoi2`, `TraLoi3`, `DapAn`) VALUES
('Đề 2', 2, 'Vì sao những tên trộm nhát gan chạy thục mạng?', 'A.Chúng bị các cụ phụ lão canh vườn nhãn rượt đuổi.', 'B.	Chúng bị những đốm sáng ma trơi đuổi theo.', 'C.	Chúng tưởng đèn đom đóm là ma trơi.', 'C'),
('Đề 2', 3, 'Điều gì khiến anh bộ đội nhớ nhà, nhớ tuổi thơ da diết?', 'A.	Anh  nghe đài hát bài “ Đom đóm” rất hay.', 'B.	Anh đang canh giữ Trường Sa và được nghe hát bài “ Đom đóm”.', '     C. Anh cùng đồng đội ở đảo Trường Sa tập hát bài “ Đom đóm”', 'B'),
('Đề 2', 4, 'Tác giả có tình cảm như thế nào với trò chơi đom đóm?', 'A.	Rất nhớ.', 'B.	Rất yêu thích.', 'C. Cả 2 ý trên đều đúng.', 'C'),
('Đề 2', 5, 'Bài văn kể về chuyện gì?', 'A. Dùng đom đóm làm đèn.', 'B. Giúp các cụ phụ lão canh vườn nhãn.', 'C.	C . Trò chơi đom đóm của tuổi nhỏ ở miền quê.', 'C'),
('Đề 2', 6, 'Từ nào sau đây trái nghĩa với từ “ nhát gan” ?', 'A.	Hèn nhát', 'B.	Dũng cảm', 'C.	Hồn nhiên', 'B'),
('Đề 2', 7, 'Từ “ vợt” trong cụm từ “dùng vợt làm bằng vải màn” và từ “ vợt” trong cụm từ “vợt lấy vợt để ”có quan hệ vói nhau như thế nào ?', 'A.	Là 1 từ nhiều nghĩa.', 'B.	Là 2 từ đồng nghĩa.', 'C.	Là 2 từ đồng âm.', 'C'),
('Đề 2', 8, 'Trong câu: “Mặc dù tuổi thơ đã qua nhưng trò chơi đom đóm vẫn luôn hiện về trong tôi.” có cặp từ chỉ quan hệ nào?', 'Quan hệ tương phản.', ' Quan hệ nguyên nhân- kết quả.', 'Quan hệ giả thiết- kết quả.', 'A'),
('Đề 2', 9, 'Trong câu chuyện trên có những loại câu nào?', 'Chỉ có câu kể, câu hỏi.', '. Chỉ có câu kể, câu cảm.', '. Có câu kể, câu cảm và câu khiến.', 'B'),
('Đề 2', 10, 'Vị ngữ  trong câu “Lòng trào lên nỗi nhớ nhà da diết, cứ ao ước được trở lại tuổi ấu thơ.”là những từ ngữ nào? ', 'A.	trào lên nỗi nhớ nhà da diết.', 'B.	cứ ao ước được trở lại tuổi ấu thơ.', 'C.	trào lên nỗi nhớ nhà da diết, cứ ao ước được trở lại tuổi ấu thơ.', 'C'),
('Để2', 1, 'Các bạn nhỏ ở vùng quê bắt đom đóm để làm gì?', 'A.Làm các trò chơi nghịch ngợm.', 'B.Làm đèn đi chơi.', 'C. Làm đèn đi tới lớp học ban đêm. ', 'A');

-- --------------------------------------------------------

--
-- Table structure for table `de`
--

CREATE TABLE `de` (
  `MaDe` varchar(200) NOT NULL,
  `TieuDe` varchar(200) NOT NULL,
  `NoiDung` text NOT NULL,
  `TacGia` varchar(200) NOT NULL,
  `Lop` varchar(200) NOT NULL,
  `ChuThich` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `de`
--

INSERT INTO `de` (`MaDe`, `TieuDe`, `NoiDung`, `TacGia`, `Lop`, `ChuThich`) VALUES
('Đề 2', 'Đọc thầm bài:Trò chơi đom đóm', ' \r\n&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspThuở bé, chúng tôi thú nhất là trò bắt đom đóm! Lũ trẻ chúng tôi cứ chờ trời sẩm tối là dùng vợt làm bằng vải màn, ra bờ ao đón đường bay của lũ đom đóm vợt lấy vợt để; “ chiến tích” sau mỗi lần vợt là hàng chục con đom đóm lớn nhỏ, mỗi buổi tối như thế có thể bắt hàng trăm con.Việc bắt đom đóm hoàn tất, trò chơi mới bắt đầu; bọn trẻ nít nhà quê đâu có thú gì khác hơn là thú chơi giản dị như thế!\r\n<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspĐầu tiên, chúng tôi bắt đom đóm cho vào trong chai, đeo lủng lẳng vào cửa lớp khi học tối. Bọn con gái bị đẩy đi trước nhìn thấy quầng sáng nhấp nháy tưởng có ma, kêu ré lên, chạy thục mạng.<br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Làm đèn chơi chán chê, chúng tôi lại bỏ đom đóm vào vỏ trứng gà. Nhưng trò này kì công hơn: phải lấy vỏ lụa bên trong quả trứng làm thành cái túi, cho đom đóm vào trong mới phát sáng được. Chúng tôi đem cái túi ấy “ thả” vào vườn nhãn của các cụ phụ lão, cái túi bằng vỏ trứng kia cứ theo gió mà bay chập chờn chẳng khác gì ma trơi khiến mấy tên trộm nhát gan chạy thục mạng.\r\n         Tuổi thơ đi qua, những trò nghịch ngợm cũng qua đi... Tôi vào bộ đội, ra canh giữ Trường Sa thân yêu, một lần nghe bài hát “ Đom đóm”, lòng trào lên nỗi nhớ nhà da diết, cứ ao ước được trở lại tuổi ấu thơ...\r\n                                                                 \r\n\r\n', 'Theo Nguyễn Duy Dương', 'Lop6', 'Ma trơi: đốm sáng thường thấy lập lòe ban đêm trên bãi tha ma.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dapan`
--
ALTER TABLE `dapan`
  ADD PRIMARY KEY (`MaDe`,`MaDapAn`);

--
-- Indexes for table `de`
--
ALTER TABLE `de`
  ADD PRIMARY KEY (`MaDe`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
