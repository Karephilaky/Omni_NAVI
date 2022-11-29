package com.example.navigatorapp.ui.alien


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigatorapp.recyclerAlien.ALIENS
import com.example.navigatorapp.recyclerAlien.adapter.AlienAdapter
import com.example.navigatorapp.databinding.FragmentAliensBinding

class AlienFragment : Fragment() {
    private var _binding: FragmentAliensBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAliensBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.Aliens.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = AlienAdapter(ALIENS.ecPlayersLists)
        }
    }
}