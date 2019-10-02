<?php 
	date_default_timezone_set("Asia/Jakarta");
	// menampilkan tanggal sekarang
	echo date("d M Y h:i A") . "<br>";

	$kemarin = strtotime("Yesterday");

	$harikeenam = strtotime("+6 days", $kemarin);
	echo date("d M Y", $harikeenam) . "<br>";

	echo date("d M Y", mktime(0, 0, 0, 8, 23, 1997));
?>