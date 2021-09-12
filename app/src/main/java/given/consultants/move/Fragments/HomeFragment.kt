package given.consultants.move.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import given.consultants.move.R


class HomeFragment : Fragment() {

    //private lateinit var Profileb
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
       
        val nextBtn: Button = view.findViewById(R.id.Profilebtn)
        val Btn: Button = view.findViewById(R.id.Settingsbtn)
        val Bttn: Button = view.findViewById(R.id.button1)

        Bttn.setOnClickListener {
            val fragment = HomeFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
        }
        
        Btn.setOnClickListener {
            val fragment = ProfileFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
        }
        nextBtn.setOnClickListener {
            val fragment = settingsFragment()  //the screen we are going t0o
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
        }
        return view
    }
}