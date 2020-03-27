package com.zsp.myjetpackdemo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.zsp.myjetpackdemo.databinding.FragmentBlankBinding
import kotlinx.android.synthetic.main.fragment_blank.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    //在Kotlin中定义变量或者属性都是需要初始化值的，并且其都是private的，但是有些时候对于变量或者属性只需要声明，但是不需要初始化，则kotlin提供了lateinit关键字来实现
//    lateinit 对应使用var来声明属性
//    lateinit 修饰不可以修饰原始数据类型（byte，char，short ,int，long，float，double）
    private lateinit var binding: FragmentBlankBinding
    // TODO: Rename and change types of parameters
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn2.setOnClickListener {
            Toast.makeText(activity,"1111111",Toast.LENGTH_SHORT).show()
            Navigation.findNavController(binding.btn2)
                .navigate(R.id.action_blankFragment_to_blankFragment2);
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentBlankBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }
}
