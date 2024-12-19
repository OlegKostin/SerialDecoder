package com.olegkos.serialdecoder.onboarding.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import com.olegkos.serialdecoder.R
import com.olegkos.serialdecoder.core.utils.DOT_SIZE
import com.olegkos.serialdecoder.core.utils.DOUBLE_SPACING
import com.olegkos.serialdecoder.core.utils.NORMAL_SPACING
import com.olegkos.serialdecoder.core.utils.ONBOARDING_IMAGE_SIZE
import com.olegkos.serialdecoder.core.utils.QUINRIPLE_SPACING
import com.olegkos.serialdecoder.core.utils.TRIPLE_SPACING

const val FIRST_INDEX_PAGE = 0
const val SECOND_INDEX_PAGE = 1
const val THIRD_INDEX_PAGE = 2

@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState(pageCount = {
        3
    })
    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize()
    ) { page ->
        when (page) {
            FIRST_INDEX_PAGE -> {
                OnBoardingScreenOne()
            }

            SECOND_INDEX_PAGE -> {
                OnBoardingScreenTwo()
            }

            THIRD_INDEX_PAGE -> {
                OnBoardingScreenThree()
            }
        }
    }
}

@Composable
fun OnBoardingScreenOne(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(DOUBLE_SPACING).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        OnBoardingImage(
            imageResId = R.drawable.on_boarding_image,
            contentDesResId = R.string.onboarding_content,
            size = ONBOARDING_IMAGE_SIZE


        )

        OnBoardingHeader(
            resId = R.string.select_brand
        )
        OnBoardingSubTitle(resId = R.string.onboarding_content_one)
        Spacer(modifier = Modifier.weight(1f))
        NavigationDots(
            currentPage = 0
        )
    }
}

@Composable
fun OnBoardingScreenTwo(modifier: Modifier = Modifier) {
    Text(
        text = "page 2"
    )
}

@Composable
fun OnBoardingScreenThree(modifier: Modifier = Modifier) {
    Text(
        text = "page 3"
    )
}

@Composable
fun OnBoardingImage(
    modifier: Modifier = Modifier,
    @DrawableRes imageResId: Int,
    @StringRes contentDesResId: Int,
    size: Dp,
) {
    Image(
        modifier = modifier
            .padding( bottom = DOUBLE_SPACING, start = DOUBLE_SPACING)
            .size(size),
        contentScale = ContentScale.Crop,
        painter = painterResource(id = imageResId),
        contentDescription = stringResource(id = contentDesResId)
    )
}

@Composable
fun OnBoardingHeader(modifier: Modifier = Modifier, @StringRes resId: Int) {
    Text(
        modifier = modifier.padding(horizontal = QUINRIPLE_SPACING, vertical = NORMAL_SPACING),
        textAlign = TextAlign.Center,
        text = stringResource(id = resId),
        style = MaterialTheme.typography.titleLarge
    )
}

@Composable
fun OnBoardingSubTitle(modifier: Modifier = Modifier, @StringRes resId: Int) {
    Text(
        modifier = modifier.padding(horizontal = QUINRIPLE_SPACING),
        text = stringResource(id = resId),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.titleSmall
    )
}

@Composable
fun NavigationDots(modifier: Modifier = Modifier, currentPage: Int) {

    Row(
        modifier = modifier.padding(bottom = QUINRIPLE_SPACING),
        horizontalArrangement = Arrangement.spacedBy(TRIPLE_SPACING)
    ) {
        Dot(selected = currentPage == FIRST_INDEX_PAGE)
        Dot(selected = currentPage == SECOND_INDEX_PAGE)
        Dot(selected = currentPage == THIRD_INDEX_PAGE)
    }
}

@Composable
fun Dot(modifier: Modifier = Modifier, selected: Boolean) {
    val color =
        if (selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondaryContainer

    Box(
        modifier = modifier
            .size(DOT_SIZE)
            .clip(CircleShape)
            .background(color = color)
    )
}
