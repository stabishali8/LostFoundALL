<?php 
$con = mysqli_connect("localhost","root","","lost_and_found");

$name = $_POST['name'];
$email = $_POST['email'];
$title = $_POST['title'];
$description = $_POST['description'];
$status = $_POST['status'];
$image = $_POST['image'];
  

	$select_query = "SELECT id FROM formdata ORDER BY id ASC";
 
	$res = mysqli_query($con,$select_query);

	$id = 0;

  while($row = mysqli_fetch_assoc($res)){
	  $id = $row['id'];
	}
  
	$path = "uploads/image/$id.PNG";

	$mainPath = "http://10.0.2.2/$path";
  
	$query = "insert into formdata(name,email,title,description,status,image) values ('$name','$email','$title','$description','$status','".$mainPath."')";
    
  
  if(mysqli_query($con,$query))
  {
	  file_put_contents($path,base64_decode($image));
	  echo 'Data entered successfully';
  }
  else{
 
 echo 'Try Again';
 
 }
 mysqli_close($con);
  

?>