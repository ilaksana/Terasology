/*
 * Copyright 2016 MovingBlocks
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
package org.terasology.logic.characters.events;

import org.terasology.entitySystem.entity.EntityRef;
import org.terasology.entitySystem.event.Event;
import org.terasology.logic.characters.MovementMode;

/**
 * Created by nihal on 15/10/16.
 */
public class StanceChangedEvent implements Event {
    private EntityRef instigator;
    private MovementMode stance;

    public StanceChangedEvent(EntityRef instigator, MovementMode stance) {
        this.instigator = instigator;
        this.stance = stance;
    }

}
