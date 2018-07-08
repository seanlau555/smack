package com.example.jonnyb.smack.Utilities

/**
 * Created by jonnyb on 9/1/17.
 */

const val BASE_URL = "https://stchatchat.herokuapp.com/v1/"
const val SOCKET_URL = "https://stchatchat.herokuapp.com/"
//const val BASE_URL = "http://10.0.2.2:3005/v1/"
const val URL_REGISTER = "${BASE_URL}account/register"
const val URL_LOGIN = "${BASE_URL}account/login"
const val URL_CREATE_USER = "${BASE_URL}user/add"
const val URL_GET_USER = "${BASE_URL}user/byEmail/"


// Broadcast Constants
const val BROADCAST_USER_DATA_CHANGE = "BROADCAST_USER_DATA_CHANGE"