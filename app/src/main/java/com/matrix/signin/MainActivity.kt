package com.matrix.signin
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var confirmButton: Button
    private lateinit var nameEditText: EditText
    private lateinit var collageEditText: EditText
    private lateinit var contactEditText: EditText
    private lateinit var emailEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_root)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        confirmButton = findViewById(R.id.confirm_button)
        nameEditText = findViewById(R.id.name_edit_text)
        collageEditText = findViewById(R.id.collage_edit_text)
        contactEditText = findViewById(R.id.contact_edit_text)
        emailEditText = findViewById(R.id.email_edit_text)

        confirmButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val collage = collageEditText.text.toString()
            val contact = contactEditText.text.toString()
            val email = emailEditText.text.toString()

            val message = "Name: $name\nCollage: $collage\nContact: $contact\nEmail: $email"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}
