package uz.umarxon.foodappui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.umarxon.foodappui.databinding.FragmentGmalBinding

class GmailFragment : Fragment() {

    lateinit var binding: FragmentGmalBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentGmalBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        binding.apply {
            back.setOnClickListener {
                findNavController().popBackStack()
            }
            next.setOnClickListener {
                findNavController().navigate(R.id.homeFragment)
            }
        }
        return binding.root
    }

}