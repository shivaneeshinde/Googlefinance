<?php

$url_one = "https://www.google.com/finance/info?q=NSE:SENSEX";

$ch_one = curl_init();

curl_setopt($ch_one, CURLOPT_SSL_VERIFYPEER, false);

curl_setopt($ch_one, CURLOPT_RETURNTRANSFER, true);

curl_setopt($ch_one, CURLOPT_URL,$url_one);

$result_one=curl_exec($ch_one);

curl_close($ch_one);

$result_one = str_replace('//', '', $result_one);

$result_one = json_decode($result_one, true);

$final_stock_result=$result_one;

 $response1 = array();

    $response1["success"] = true; 
    foreach ($final_stock_result as $response)

{
    $response1["id"] =$response['id'];
    $response1["t"] =$response['t'];
    $response1["e"] =$response['e'];
    $response1["l"] =$response['l'];
    $response1["l_fix"] =$response['l_fix'];
    $response1["l_cur"] =$response['l_cur'];
    $response1["s"] =$response['s'];
    $response1["ltt"] =$response['ltt'];
    $response1["lt"] =$response['lt'];
    $response1["lt_dts"] =$response['lt_dts'];
    $response1["c"] =$response['c'];
    $response1["c_fix"] =$response['c_fix'];
    $response1["cp"] =$response['cp'];
    $response1["cp_fix"] =$response['cp_fix'];
    $response1["ccol"] =$response['ccol'];
    $response1["pcls_fix"] =$response['pcls_fix'];
}

echo json_encode(array('user' => $response1));

 ?>
 
