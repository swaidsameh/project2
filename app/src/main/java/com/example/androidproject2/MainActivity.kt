package com.example.androidproject2

import android.content.Intent

val intent = Intent(this, HomeActivity::class.java).apply {
    putExtra("profileImage", /* profile image data */)
    putExtra("username", /* username data */)
    putExtra("name", /* name data */)
    putExtra("email", /* email data */)
    putExtra("age", /* age data */)
    putExtra("address", /* address data */)
}

fun putExtra(s: String) {

}
startActivity(intent)