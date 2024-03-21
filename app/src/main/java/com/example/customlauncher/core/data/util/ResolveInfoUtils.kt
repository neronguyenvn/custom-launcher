package com.example.customlauncher.core.data.util

import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import com.example.customlauncher.core.database.model.UserAppEntity

val ResolveInfo.packageName: String get() = activityInfo.packageName

fun ResolveInfo.asApplicationEntity(
    packageManager: PackageManager,
    index: Int,
    page: Int
) = UserAppEntity(
    name = loadLabel(packageManager).toString(),
    packageName = packageName,
    version = packageManager.getPackageInfo(packageName, 0).versionName,
    index = index,
    page = page
)
