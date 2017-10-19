/*
 *  Copyright 2016 Patrick Favre-Bulle
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package at.favre.app.hood.demo;

import android.support.annotation.NonNull;

import at.favre.lib.hood.interfaces.Config;
import at.favre.lib.hood.interfaces.Pages;

public class DebugCustomThemeActivity extends DebugDarkMultiPageActivity {
    private static final String TAG = DebugCustomThemeActivity.class.getName();

    @NonNull
    @Override
    public Pages getPageData(@NonNull Pages pages) {
        return super.getPageData(pages);
    }

    @NonNull
    @Override
    public Config getConfig() {
        return Config.newBuilder().setLogTag(TAG).setAutoLog(false).setAutoRefresh(true).build();
    }
}
