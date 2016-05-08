@file:JvmName("ExtensionsUtils")

package com.largerlife.kotlin.keddit.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by László Gálosi on 08/05/16
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}
