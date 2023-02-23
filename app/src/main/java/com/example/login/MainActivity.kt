package com.example.login

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnlogin.setOnClickListener { login() }

    }
    private fun login() {
        val username = binding.username.text.toString()
        val password = binding.password.text.toString()
        if (username == "" || password == "") {
            binding.result.text = "Please enter your Username or Password!"
        } else if (username == "VKU" && password == "123") {
            binding.result.text = "Logged in successfully!"
            binding.username.text.clear()
            binding.password.text.clear()
        } else {
            binding.result.text = "Username or password is incorrect!"
        }
    }
}