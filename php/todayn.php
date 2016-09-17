<?php

$url_one = "https://www.google.com/finance/info?q=NSE:NIFTY";

$ch_one = curl_init();

curl_setopt($ch_one, CURLOPT_SSL_VERIFYPEER, false);

curl_setopt($ch_one, CURLOPT_RETURNTRANSFER, true);

curl_setopt($ch_one, CURLOPT_URL,$url_one);

$result_one=curl_exec($ch_one);

curl_close($ch_one);

$result_one = str_replace('//', '', $result_one);

$result_one = json_decode($result_one, true);

$final_stock_result=$result_one;

 $response1["user"] = array();

    $response1["success"] = true; 
    foreach ($final_stock_result as $response)

{
   
    $user=array();
    $user["id"] =$response['id'];
    $user["t"] =$response['t'];
    $user["e"] =$response['e'];
    $user["l"] =$response['l'];
    $user["l_fix"] =$response['l_fix'];
    $user["l_cur"] =$response['l_cur'];
    $user["s"] =$response['s'];
    $user["ltt"] =$response['ltt'];
    $user["lt"] =$response['lt'];
    $user["lt_dts"] =$response['lt_dts'];
    $user["c"] =$response['c'];
    $user["c_fix"] =$response['c_fix'];
    $user["cp"] =$response['cp'];
    $user["cp_fix"] =$response['cp_fix'];
    $user["ccol"] =$response['ccol'];
    $user["pcls_fix"] =$response['pcls_fix'];

  array_push($response1["user"], $user); 
}

echo json_encode($response1);

 ?>
 
