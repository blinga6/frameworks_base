/*
 * Copyright (C) 2014-2015 The CyanogenMod Project
 * Copyright (C) 2016 Turbo ROM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.egg;

import com.android.systemui.R;

import android.content.Context;
import android.util.AttributeSet;

public class TurboLand extends MLand {
    public static final String TAG = "TurboLand";

    public TurboLand(Context context) {
        this(context, null);
    }

    public TurboLand(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TurboLand(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getEggPlayer() {
        return R.drawable.tid;
    }
}
