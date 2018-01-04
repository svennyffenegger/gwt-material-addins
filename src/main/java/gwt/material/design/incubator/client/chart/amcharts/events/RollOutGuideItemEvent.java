/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
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
 * #L%
 */
package gwt.material.design.incubator.client.chart.amcharts.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import gwt.material.design.incubator.client.chart.amcharts.events.object.AxisItemEventData;
//@formatter:off

/**
 * Fired if user rolls-out of the axis label.
 *
 * @author kevzlou7979
 */
public class RollOutGuideItemEvent extends GwtEvent<RollOutGuideItemEvent.RollOutGuideItemHandler> {

    public static final Type<RollOutGuideItemHandler> TYPE = new Type<>();
    private AxisItemEventData data;

    public RollOutGuideItemEvent(AxisItemEventData data) {
        this.data = data;
    }

    public static Type<RollOutGuideItemHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, AxisItemEventData data) {
        source.fireEvent(new RollOutGuideItemEvent(data));
    }

    @Override
    public Type<RollOutGuideItemHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(RollOutGuideItemEvent.RollOutGuideItemHandler handler) {
        handler.onRollOutGuideItem(this);
    }

    public AxisItemEventData getData() {
        return data;
    }

    public interface RollOutGuideItemHandler extends EventHandler {
        void onRollOutGuideItem(RollOutGuideItemEvent event);
    }
}
