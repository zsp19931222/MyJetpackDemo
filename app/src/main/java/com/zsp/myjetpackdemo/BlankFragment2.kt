package com.zsp.myjetpackdemo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.zsp.myjetpackdemo.bean.User
import com.zsp.myjetpackdemo.databinding.FragmentBlank2Binding
import kotlinx.android.synthetic.main.fragment_blank2.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment2 : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var dataBinding: FragmentBlank2Binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_blankFragment2_to_blankFragment3)
        }
        dataBinding.viewModel=User("zhou","shaopeng2222")
        dataBinding.firstName="zhou"
        dataBinding.lastName="shaopeng"
        Log.d("dataBinding",dataBinding.firstName)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = FragmentBlank2Binding.inflate(inflater)
        return dataBinding.root
    }

}
