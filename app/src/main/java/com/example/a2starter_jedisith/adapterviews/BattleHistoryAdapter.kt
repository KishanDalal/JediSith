package com.example.a2starter_jedisith.adapterviews

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a2starter_jedisith.entities.SingleBattleResult
import com.example.a2starter_jedisith.databinding.SingleBattleRowLayoutBinding

class BattleResultViewHolder(private val binding:SingleBattleRowLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(singleBattleResult: SingleBattleResult) {
        // @TODO: Bind the <variable> in the XML to the current battle object
        binding.executePendingBindings()
    }
}
class BattleHistoryAdapter (private val battleHistoryList: List<SingleBattleResult>) : RecyclerView.Adapter<BattleResultViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BattleResultViewHolder {
        val context = parent.context
        val layoutInflater = LayoutInflater.from(context)

        // Create a binding variable that is instantiated to single_battle_row_layout.xml file
        val binding = SingleBattleRowLayoutBinding.inflate(layoutInflater, parent, false)

        // Return the view holder
        return BattleResultViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: BattleResultViewHolder, position: Int) {

        val battleResult: SingleBattleResult = battleHistoryList.get(position)

        // send the results of the battle to the ViewHolder (line 9)
        viewHolder.bind(battleResult)
    }

    // Returns the total count of items in the list
    override fun getItemCount(): Int {
        return battleHistoryList.size
    }
}