<?php
	require "connect.php";
	//$SDT = isset($_POST[ 'SDT' ]);
	//$MatKhau = isset($_POST['MatKhau']);
$SDT = "0972582560";
$MatKhau = "123";
	Class Nguoidung {
		function Nguoidung ( $id,$user, $phone ,$cmt, $ngaysinh, 
			$gioitinh, $password){
				$this->ID = $id;
				$this->tennd = $user;
				$this->sdt = $phone;
				$this->cmt = $cmt;
				$this->ngaysinh = $ngaysinh;
				$this->gioitinh = $gioitinh;
				
				$this->matkhau = $password;

		}
	}
	

	if (strlen($SDT) > 0 && strlen($MatKhau) >0){
			
		$mangnguoidung = array();
		$query = "SELECT * FROM nguoidung WHERE FIND_IN_SET('$SDT',SDT) AND FIND_IN_SET('$MatKhau', MatKhau)";
		$data = mysqli_query($con, $query);
		if ($data){
			while($row = mysqli_fetch_assoc($data)){
				array_push($mangnguoidung, new Nguoidung(
								$row['ID']
								,$row['TenND']
								,$row['SDT']
								,$row['CMT']
								,$row['NgaySinh']
								,$row['GioiTinh']
							
								,$row['MatKhau']));
			}
			if(count($mangnguoidung) >0){
				echo json_encode($mangnguoidung);

			}else{
				echo "Fail";
			}
		}
	} else{
		echo "Null";
	}
?>