///
/// JFunc_void_std__string.hpp
/// This file was generated by nitrogen. DO NOT MODIFY THIS FILE.
/// https://github.com/mrousavy/nitro
/// Copyright © 2024 Marc Rousavy @ Margelo
///

#pragma once

#include <fbjni/fbjni.h>
#include <functional>

#include <functional>
#include <string>

namespace margelo::nitro::customcrop {

  using namespace facebook;

  /**
   * C++ representation of the callback Func_void_std__string.
   * This is a Kotlin `(image: String) -> Unit`, backed by a `std::function<...>`.
   */
  struct JFunc_void_std__string final: public jni::HybridClass<JFunc_void_std__string> {
  public:
    static jni::local_ref<JFunc_void_std__string::javaobject> fromCpp(const std::function<void(const std::string& /* image */)>& func) {
      return JFunc_void_std__string::newObjectCxxArgs(func);
    }

  public:
    void call(jni::alias_ref<jni::JString> image) {
      return _func(image->toStdString());
    }

  public:
    static auto constexpr kJavaDescriptor = "Lcom/margelo/nitro/customcrop/Func_void_std__string;";
    static void registerNatives() {
      registerHybrid({makeNativeMethod("call", JFunc_void_std__string::call)});
    }

  private:
    explicit JFunc_void_std__string(const std::function<void(const std::string& /* image */)>& func): _func(func) { }

  private:
    friend HybridBase;
    std::function<void(const std::string& /* image */)> _func;
  };

} // namespace margelo::nitro::customcrop
