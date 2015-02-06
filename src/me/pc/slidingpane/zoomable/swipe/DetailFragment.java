/*******************************************************************************
 * Copyright 2013 Peter Pan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package me.pc.slidingpane.zoomable.swipe;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

public class DetailFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Context context = new ContextThemeWrapper(getActivity(),
				R.style.FragTheme);
		LayoutInflater newInflater = inflater.cloneInContext(context);
		View view = newInflater.inflate(R.layout.detail_fragment, container,
				false);
		setHasOptionsMenu(true);// trigger onCreateOptionsMenu() of Activity by
								// this method;
		return view;
	}

	/*
	 * (non-avadoc) <p>Title: onCreateOptionsMenu</p> <p>Description: change the
	 * ActionBar of the Activity of Parent</p>
	 * 
	 * @params @param menu
	 * 
	 * @params @param inflater
	 * 
	 * @overrided @see
	 * android.app.Fragment#onCreateOptionsMenu(android.view.Menu,
	 * android.view.MenuInflater)
	 */
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.menu.detail, menu);
	}

}
