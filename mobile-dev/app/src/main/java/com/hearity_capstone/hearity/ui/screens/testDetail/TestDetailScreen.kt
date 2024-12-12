package com.hearity_capstone.hearity.ui.screens.testDetail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.hearity_capstone.hearity.ui.common.AppTopBar
import com.hearity_capstone.hearity.ui.theme.IconSizeMedium
import com.hearity_capstone.hearity.ui.theme.PaddingMedium
import com.hearity_capstone.hearity.ui.theme.SpacingMedium

@Composable
fun TestDetailScreen(navController: NavHostController, id: Int? = null) {
    Scaffold(topBar = { TopBar(navController) }) {
        // Dummy data, next step is to get data from API (get testResult by id)
//        val testResult = remember { testResultDummyData.find { result -> result.id == id } }

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(it)
                .padding(horizontal = PaddingMedium)
                .fillMaxSize()
        ) {

            Spacer(Modifier.height(SpacingMedium))
//            if (testResult != null) {
//                OverviewCard(testResult = testResult)
//                Spacer(Modifier.height(SpacingSection))
//
//                Spacer(Modifier.height(SpacingItem))
//                Box(
//                    Modifier
//                        .fillMaxWidth()
//                        .height(245.dp)
//                ) {
//                    AudiometryGraph(testResult = testResult)
//                }
//
//                HearingLevelTable(testResult)
//                Spacer(Modifier.height(SpacingItem))
//                Row(
//                    Modifier
//                        .fillMaxWidth()
//                        .height(150.dp)
//                ) {
//                    HearingLevelInfoCard(
//                        Modifier
//                            .weight(1.5f)
//                            .fillMaxHeight()
//                    )
//                    Spacer(Modifier.width(SpacingItem))
//                    OpenTestFileCard(Modifier.weight(1f))
//                }
//
//
//                Spacer(Modifier.height(SpacingSection))
//
//                // Summary Card
//                SectionTitle(
//                    title = "Summary",
//                    icon = Icons.Outlined.Description,
//                )
//                Spacer(Modifier.height(SpacingSection))
//
//                AppCard(
//                    size = AppCardSize.LARGE,
//                    colors = CardColors(
//                        containerColor = MaterialTheme.colorScheme.tertiaryContainer.copy(alpha = 0.5f),
//                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
//                        disabledContainerColor = MaterialTheme.colorScheme.tertiaryContainer.copy(
//                            alpha = 0.5f
//                        ),
//                        disabledContentColor = MaterialTheme.colorScheme.onTertiaryContainer
//                    )
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                    ) {
//                        HearingLevelSummaryTable(testResult = testResult)
//                        Spacer(Modifier.height(SpacingItem))
//
//                        // Summary
//                        Text(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(PaddingSmall),
//                            text = testResult.summary,
//                            style = MaterialTheme.typography.bodyMedium,
//                            overflow = TextOverflow.Ellipsis
//                        )
//                    }
//                }
//            }
        }
    }
}


@Composable
private fun TopBar(navController: NavHostController) {
    AppTopBar(
        navController = navController, title = "Test Details",
        action = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Outlined.Share,
                    contentDescription = "Share button",
                    Modifier.size(
                        IconSizeMedium
                    )
                )
            }
        }
    )
}
