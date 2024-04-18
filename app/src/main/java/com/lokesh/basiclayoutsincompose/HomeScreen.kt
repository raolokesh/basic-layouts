package com.lokesh.basiclayoutsincompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Spa
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lokesh.basiclayoutsincompose.ui.theme.BasicLayoutsInComposeTheme
import androidx.compose.material3.minimumInteractiveComponentSize
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        SearchBar(Modifier.padding(horizontal = 16.dp))
        HomeSection(R.string.align_your_body, Modifier) {
            AlignYourBodyRow(Modifier)
        }
        HomeSection(R.string.favorite_collections, Modifier) {
            FavoriteCollectionsGrid(Modifier)
        }

    }

}


@Composable
fun BottomNavigationBar(modifier: Modifier = Modifier) {
    NavigationBar(
        modifier = modifier,
        containerColor = MaterialTheme.colorScheme.surfaceVariant
    ) {

        NavigationBarItem(selected = true,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    imageVector = Icons.Default.Spa,
                    contentDescription = null
                )
            },
            label = {
                Text(text = "Home")
            })
        NavigationBarItem(selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null
                )
            },
            label = {
                Text(text = "Profile")
            })
    }

}

@Composable
fun NavigationRailApp(modifier: Modifier = Modifier) {
    NavigationRail(
        modifier = modifier.padding(start = 8.dp, end = 8.dp),
        containerColor = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavigationRailItem(selected = true,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        imageVector = Icons.Default.Spa,
                        contentDescription = null
                    )
                },
                label = {
                    Text(text = "Home")
                })
            Spacer(modifier = Modifier.height(8.dp))
            NavigationRailItem(selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = null
                    )
                },
                label = {
                    Text(text = "Profile")
                })
        }
    }
}

//@Preview
//@Composable
//private fun BottomNavigationBarPreivew() {
//    NavigationRailApp()
//}


@Composable
fun AppScreenPortait() {
    BasicLayoutsInComposeTheme {
        Scaffold(
            bottomBar = { BottomNavigationBar() }
        ) { padding ->
            HomeScreen(Modifier.padding(padding))
        }
    }
}

@Composable
fun AppScreenHorizontal() {
    BasicLayoutsInComposeTheme {
        Row {
            NavigationRailApp()
            HomeScreen()
        }
    }
}


//@Preview
//@Composable
//private fun AppScreenPreview() {
//    BasicLayoutsInComposeTheme {
//        Scaffold(
//            bottomBar = { BottomNavigationBar() }
//        ) { padding ->
//            HomeScreen(Modifier.padding(padding))
//        }
//    }
//}
@Preview
@Composable
private fun AppScreenPreview() {
    BasicLayoutsInComposeTheme {
        Row {
            NavigationRailApp()
            HomeScreen()
        }
    }
}



//@Preview(showBackground = true, heightDp = 200 , widthDp = 400)
//@Composable
//private fun HomeScreenPreview() {
//    HomeScreen()
//}