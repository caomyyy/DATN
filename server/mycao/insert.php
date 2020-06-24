<?php
	require "connect.php";

	$TenND =  isset($_POST['TenND']);
	$SDT =  isset($_POST['SDT']);
	$CMT =  isset($_POST['CMT']);
	$NgaySinh = isset($_POST['NgaySinh']);
	$GioiTinh = isset($_POST['GioiTinh']);
	$MatKhau = isset($_POST['MatKhau']);

	if (strlen($TenND) > 0 
		&& strlen($SDT) >0 
		&& strlen($CMT) >0
		&& strlen($NgaySinh) >0
		&& strlen($GioiTinh) >0
		&& strlen($MatKhau) >0
	){
		$query = "INSERT INTO nguoidung VALUES(null, '$TenND' , '$SDT', '$CMT', '$NgaySinh', '$GioiTinh', '$MatKhau')";
		$data = myqli_query($con,$query);
		if ($data) {
			echo "success";
		}else {
			echo "that bai";
		}
	}else{
		echo "Null";
	}


?>