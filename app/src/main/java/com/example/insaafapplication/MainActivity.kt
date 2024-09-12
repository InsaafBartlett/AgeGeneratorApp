package com.example.insaafapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //variables
    lateinit var editText: EditText
    lateinit var ebutton: Button
    lateinit var etextview: TextView
    lateinit var cleartextbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editTextTextName)
        ebutton = findViewById(R.id.buttonClickHere)
        etextview = findViewById(R.id.textShow)
        cleartextbutton = findViewById(R.id.buttonClearText)

        val agelimit = 100

        //onclick button
        ebutton.setOnClickListener {

            val getAge = editText.text.toString()

            //Making use of the If Statement

            if (getAge.isNotEmpty()) {
                val value = getAge.toInt()

                if (value > agelimit) {
                    Toast.makeText(this, "Please type in a valid age", Toast.LENGTH_SHORT)
                        .show()
                }




            }

<<<<<<< HEAD

        }



            var agenumber = editText.text.toString()

            var ages = agenumber.toInt()

            //When Statement

            when (agenumber) {
                10.toString() -> etextview.text = "You are the same age as Judith Barsi she was an American actress and voice actress. She starred in Jaws:The revenge.She died to assasination. (Learn about Judith Barsi 2012)"
                24.toString() -> etextview.text = "You're the same age as American Rapper Christopher George Wallace also known as Notorious B.I.G. He died at the age of 24 in the West Coast and East Coast Fued. (JT list verse fact checked by dickensgirl et al., 2014)"
                35.toString() -> etextview.text = "35 years old is the same age as Wolfgangus Mozart, the most famous and influential composers of the classical times.he composed over 600 works.He died due to an acute nephritic syndrome."
                40.toString() -> etextview.text = "You are the same age as Paul Walker.The actor from the well known movie series The Fast and the Furious. Paul Walker died in a car crash. ( Legacy Staff, 2021)"
                51.toString() -> etextview.text = "You are the same age as the King of Pop also known as Micheal Jackson, a singer and entertainer. Micheal started out in a group called the Jackson 5 where he was the lead singer.His cause of death was a cardiac arrest. (Vincent, 2024)"
                63.toString() -> etextview.text = "You are the same age as Robin 'Robbie' Williams. A famous comedic actor, writer and producer. He played in the original movie Jumanji.His cause of death was suicide."
                72.toString() -> etextview.text = "You and Carlos Alberto Torres are the same age.Carlos was a famous Brazilian soccer player. He was captain of the Brazilian Soccer team in the 1970 world cup where he lead them to victory.He died of cardiac arrest. (Borg, Carlos Alberto: Brazil Soccer Great dies at 72 2016)"
                76.toString() -> etextview.text = "You share an age with Albert Einstein. Albert was a German American theoretical physicist.He is best known for his equation E=mc.Albert died because of a ruputured abdominal aortic anuerysm. (Kaku, 2024)"
                84.toString() -> etextview.text = "Sir Isaac Newton and you share an age. Sir Isaac Newton was a famous mathematician and physicist.He was famous for his formulation of three laws of motion. (Tillman & Gordon, 2022)"
                90.toString() -> etextview.text = "You share an age with Winston Churchill, he was a British Prime Minister in World War 2.He encouraged bravery.He died serving the British Army."
                100.toString() -> etextview.text = "You are the same age as John.B.Goodenough.He was a physicist. He was the inventor of the Litium-ion battery."

                else->
                {
                    Toast.makeText(this,"Please type something in textfield", Toast.LENGTH_SHORT).show()
                }




            }
        {







    }
        // Onclick button to clear editText and textview

        cleartextbutton.setOnClickListener {

            editText.text.clear()
            etextview.text=""
=======
                val agenumbers= editText.text.toString()
            val ages = agenumbers.toInt()

            //When Statement

            when (agenumbers) {
                10.toString() -> etextview.text =
                    "You are the same age as Judith Barsi she was an American actress and voice actress. She starred in Jaws:The revenge.She died to assasination. (Learn about Judith Barsi 2012)"

                24.toString() -> etextview.text =
                    "You're the same age as American Rapper Christopher George Wallace also known as Notorious B.I.G. He died at the age of 24 in the West Coast and East Coast Fued. (JT list verse fact checked by dickensgirl et al., 2014)"

                35.toString() -> etextview.text =
                    "35 years old is the same age as Wolfgangus Mozart, the most famous and influential composers of the classical times.he composed over 600 works.He died due to an acute nephritic syndrome."

                40.toString() -> etextview.text =
                    "You are the same age as Paul Walker.The actor from the well known movie series The Fast and the Furious. Paul Walker died in a car crash. ( Legacy Staff, 2021)"

                51.toString() -> etextview.text =
                    "You are the same age as the King of Pop also known as Micheal Jackson, a singer and entertainer. Micheal started out in a group called the Jackson 5 where he was the lead singer.His cause of death was a cardiac arrest. (Vincent, 2024)"

                63.toString() -> etextview.text =
                    "You are the same age as Robin 'Robbie' Williams. A famous comedic actor, writer and producer. He played in the original movie Jumanji.His cause of death was suicide."

                72.toString() -> etextview.text =
                    "You and Carlos Alberto Torres are the same age.Carlos was a famous Brazilian soccer player. He was captain of the Brazilian Soccer team in the 1970 world cup where he lead them to victory.He died of cardiac arrest. (Borg, Carlos Alberto: Brazil Soccer Great dies at 72 2016)"

                76.toString() -> etextview.text =
                    "You share an age with Albert Einstein. Albert was a German American theoretical physicist.He is best known for his equation E=mc.Albert died because of a ruputured abdominal aortic anuerysm. (Kaku, 2024)"

                84.toString() -> etextview.text =
                    "Sir Isaac Newton and you share an age. Sir Isaac Newton was a famous mathematician and physicist.He was famous for his formulation of three laws of motion. (Tillman & Gordon, 2022)"

                90.toString() -> etextview.text =
                    "You share an age with Winston Churchill, he was a British Prime Minister in World War 2.He encouraged bravery.He died serving the British Army."

                100.toString() -> etextview.text =
                    "You are the same age as John.B.Goodenough.He was a physicist. He was the inventor of the Litium-ion battery."

                else -> {
                    etextview.text = "No Famous Figures died at this age."
                }


            }
            {


            }
            // Onclick button to clear editText and textview

            cleartextbutton.setOnClickListener {

                editText.text.clear()
                etextview.text = ""
            }
>>>>>>> 873039a (I corrected my codes)
        }
    }

}