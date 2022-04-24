package uz.umarxon.foodappui

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.umarxon.foodappui.databinding.FragmentRegisterBinding

/**
 * An example full-screen fragment that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity as? AppCompatActivity)?.apply {
            supportActionBar?.hide()
            window?.statusBarColor = Color.TRANSPARENT
        }

        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            google.setOnClickListener {
                gotoNextWindow()
            }
            facebook.setOnClickListener {
                gotoNextWindow()
            }
            gmail.setOnClickListener {
                gotoNextWindow()
            }
            enter.setOnClickListener {
                gotoNextWindow()
            }
        }
    }

    private fun gotoNextWindow(){
        findNavController().navigate(R.id.gmalFragment)
    }

    override fun onResume() {
        super.onResume()
        activity?.window?.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}