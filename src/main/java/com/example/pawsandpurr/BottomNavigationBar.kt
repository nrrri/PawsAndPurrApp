package com.example.pawsandpurr

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Chat
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

val items = listOf(
    BottomNavigation(
        title = "Home",
        icon = Icons.Rounded.Home
    ),
    BottomNavigation(
        title = "Favourite",
        icon = Icons.Rounded.Favorite
    ),
    BottomNavigation(
        title = "Chat",
        icon = Icons.Rounded.Chat
    ),
    BottomNavigation(
        title = "Info",
        icon = Icons.Rounded.Person
    ),

)

@Preview
@Composable
fun BottomNavigationBar() {
    val myTheme = MaterialTheme.colorScheme
    NavigationBar {
        Row(
            modifier = Modifier
                .background(myTheme.inverseOnSurface)
        ) {
            items.forEachIndexed() { index, item ->
                NavigationBarItem(selected = index == 0,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = myTheme.onBackground
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            color = myTheme.onBackground)
                    })
            }
        }
    }
}