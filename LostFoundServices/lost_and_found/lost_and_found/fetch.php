<?php
  $con = mysqli_connect("localhost","root","","lost_and_found");
  
  $query = "select title,image,description,status from formdata";
  
  $result = mysqli_query($con, $query);
  
  while($rs = mysqli_fetch_assoc($result)){
  
    $arrRows[] = $rs;

  }
  echo json_encode($arrRows);

?>