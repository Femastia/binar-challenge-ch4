package com.ihsan.challengechapter4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val batu: ImageButton by lazy {
        findViewById(R.id.player_batu)
    }
    private val gunting: ImageButton by lazy {
        findViewById(R.id.player_gunting)
    }
    private val kertas: ImageButton by lazy {
        findViewById(R.id.player_kertas)
    }

    private val computerB: ImageView by lazy {
        findViewById(R.id.img_computerB)
    }
    private val computerG: ImageView by lazy {
        findViewById(R.id.img_computerG)
    }
    private val computerK: ImageView by lazy {
        findViewById(R.id.img_computerK)
    }

    private val hasil: TextView by lazy {
        findViewById(R.id.tv_hasil)
    }
    private val refresh: ImageButton by lazy {
        findViewById(R.id.reset_game)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        batu.setOnClickListener {
            val player1 = 0
            val player2 = Random.nextInt(3)

            batu.setImageResource(R.drawable.batu)
            gunting.setImageResource(R.drawable.gunting)
            kertas.setImageResource(R.drawable.kertas)
            computerB.setImageResource(R.drawable.batu)
            computerG.setImageResource(R.drawable.gunting)
            computerK.setImageResource(R.drawable.kertas)
            batu.setImageResource(R.drawable.batu_x)

            when (player2) {
                0 -> computerB.setImageResource(R.drawable.batu_x)
                1 -> computerG.setImageResource(R.drawable.gunting_x)
                2 -> computerK.setImageResource(R.drawable.kertas_x)
            }

            if (player1 == player2) {
                hasil.text = "Hasil Seri!"
            } else if (
                (player1 == 0 && player2 == 1) ||
                (player1 == 1 && player2 == 2) ||
                (player1 == 2 && player2 == 0)
            ) {
                hasil.text = "Anda Menang!!"
            } else {
                hasil.text = "Anda Kalah.."
            }
        }

        gunting.setOnClickListener {
            val player1 = 1
            val player2 = Random.nextInt(3)

            batu.setImageResource(R.drawable.batu)
            gunting.setImageResource(R.drawable.gunting)
            kertas.setImageResource(R.drawable.kertas)
            computerB.setImageResource(R.drawable.batu)
            computerG.setImageResource(R.drawable.gunting)
            computerK.setImageResource(R.drawable.kertas)
            gunting.setImageResource(R.drawable.gunting_x)

            when (player2) {
                0 -> computerB.setImageResource(R.drawable.batu_x)
                1 -> computerG.setImageResource(R.drawable.gunting_x)
                2 -> computerK.setImageResource(R.drawable.kertas_x)
            }

            if (player1 == player2) {
                hasil.text = "Hasil Seri!"
            } else if (
                (player1 == 0 && player2 == 1) ||
                (player1 == 1 && player2 == 2) ||
                (player1 == 2 && player2 == 0)
            ) {
                hasil.text = "Anda Menang!!"
            } else {
                hasil.text = "Anda Kalah.."
            }
        }

        kertas.setOnClickListener {
            val player1 = 2
            val player2 = Random.nextInt(3)

            batu.setImageResource(R.drawable.batu)
            gunting.setImageResource(R.drawable.gunting)
            kertas.setImageResource(R.drawable.kertas)
            computerB.setImageResource(R.drawable.batu)
            computerG.setImageResource(R.drawable.gunting)
            computerK.setImageResource(R.drawable.kertas)
            kertas.setImageResource(R.drawable.kertas_x)

            when (player2) {
                0 -> computerB.setImageResource(R.drawable.batu_x)
                1 -> computerG.setImageResource(R.drawable.gunting_x)
                2 -> computerK.setImageResource(R.drawable.kertas_x)
            }

            if (player1 == player2) {
                hasil.text = "Hasil Seri!"
            } else if (
                (player1 == 0 && player2 == 1) ||
                (player1 == 1 && player2 == 2) ||
                (player1 == 2 && player2 == 0)
            ) {
                hasil.text = "Anda Menang!!"
            } else {
                hasil.text = "Anda Kalah.."
            }
        }
        refresh.setOnClickListener {
            batu.setImageResource(R.drawable.batu)
            gunting.setImageResource(R.drawable.gunting)
            kertas.setImageResource(R.drawable.kertas)
            computerB.setImageResource(R.drawable.batu)
            computerG.setImageResource(R.drawable.gunting)
            computerK.setImageResource(R.drawable.kertas)
            hasil.text = "PILIHLAH SALAH SATU DI SISI KIRI UNTUK MULAI"
        }
    }
}