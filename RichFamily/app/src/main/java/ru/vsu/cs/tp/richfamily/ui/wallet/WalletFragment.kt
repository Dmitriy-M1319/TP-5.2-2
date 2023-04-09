package ru.vsu.cs.tp.richfamily.ui.wallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import ru.vsu.cs.tp.richfamily.R
import ru.vsu.cs.tp.richfamily.databinding.FragmentWalletBinding

class WalletFragment : Fragment() {

    lateinit var binding: FragmentWalletBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_wallet,
            container,
            false
        )
        binding.fab.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_walletFragment_to_addWalletFragment)
        }
        return binding.root
    }
}