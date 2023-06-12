package com.example.projectnouri

import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface Destinations {
    val Route:String
    val  icon:ImageVector
    val title:String
}

object Login:Destinations{
    override val Route: String="Login"
    override val icon: ImageVector= Icons.Filled.Home
    override val title: String="Login"
}

object welcome:Destinations{
    override val Route: String="Welcome"
    override val icon: ImageVector= Icons.Filled.Settings
    override val title: String="Welcome"
}