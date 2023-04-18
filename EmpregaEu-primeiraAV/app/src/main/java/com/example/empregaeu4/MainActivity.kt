package com.example.empregaeu4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.empregaeu4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val Nomelogin = binding.Usuario
        val btLogin = binding.btLogin
        val Senhalogin = binding.Senha

        btLogin.setOnClickListener {

            if (Senhalogin != null) {
                if(Nomelogin.text.toString() == "Carpina" && Senhalogin.text.toString().toIntOrNull() == 777) {
                    val intent = Intent(this, Tela2Activity::class.java)
                    val texto = Nomelogin.text.toString()
                    intent.putExtra("nome", texto)
                    startActivity(intent)
                } else{
                    Toast.makeText(this, R.string.error, Toast.LENGTH_SHORT).show()
                }
            }
        }

        //setContentView(R.layout.activity_main)
    }
}
