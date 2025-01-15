///
/// HybridImagePerspectiveCropperSpec.kt
/// This file was generated by nitrogen. DO NOT MODIFY THIS FILE.
/// https://github.com/mrousavy/nitro
/// Copyright © 2025 Marc Rousavy @ Margelo
///

package com.margelo.nitro.customcrop

import android.util.Log
import androidx.annotation.Keep
import com.facebook.jni.HybridData
import com.facebook.proguard.annotations.DoNotStrip
import com.margelo.nitro.core.*

/**
 * A Kotlin class representing the ImagePerspectiveCropper HybridObject.
 * Implement this abstract class to create Kotlin-based instances of ImagePerspectiveCropper.
 */
@DoNotStrip
@Keep
@Suppress(
  "KotlinJniMissingFunction", "unused",
  "RedundantSuppression", "RedundantUnitReturnType", "SimpleRedundantLet",
  "LocalVariableName", "PropertyName", "PrivatePropertyName", "FunctionName"
)
abstract class HybridImagePerspectiveCropperSpec: HybridObject() {
  @DoNotStrip
  private var mHybridData: HybridData = initHybrid()

  init {
    // Pass this `HybridData` through to it's base class,
    // to represent inheritance to JHybridObject on C++ side
    super.updateNative(mHybridData)
  }

  /**
   * Call from a child class to initialize HybridData with a child.
   */
  override fun updateNative(hybridData: HybridData) {
    mHybridData = hybridData
  }

  // Properties
  

  // Methods
  abstract fun detectRectangleForImage(image: String, onSuccess: (rectangle: Rectangle) -> Unit, onError: (message: String) -> Unit): Unit
  
  @DoNotStrip
  @Keep
  private fun detectRectangleForImage_cxx(image: String, onSuccess: Func_void_Rectangle, onError: Func_void_std__string): Unit {
    val __result = detectRectangleForImage(image, onSuccess, onError)
    return __result
  }
  
  abstract fun cropImage(image: String, rectangle: Rectangle, onSuccess: (image: String) -> Unit, onError: (message: String) -> Unit): Unit
  
  @DoNotStrip
  @Keep
  private fun cropImage_cxx(image: String, rectangle: Rectangle, onSuccess: Func_void_std__string, onError: Func_void_std__string): Unit {
    val __result = cropImage(image, rectangle, onSuccess, onError)
    return __result
  }

  private external fun initHybrid(): HybridData

  companion object {
    private const val TAG = "HybridImagePerspectiveCropperSpec"
    init {
      try {
        Log.i(TAG, "Loading ImagePerspectiveCropper C++ library...")
        System.loadLibrary("ImagePerspectiveCropper")
        Log.i(TAG, "Successfully loaded ImagePerspectiveCropper C++ library!")
      } catch (e: Error) {
        Log.e(TAG, "Failed to load ImagePerspectiveCropper C++ library! Is it properly installed and linked? " +
                    "Is the name correct? (see `CMakeLists.txt`, at `add_library(...)`)", e)
        throw e
      }
    }
  }
}
