package com.apple.eawt.event;
// ================================================================================================================================
//     PROJECT: ProxyBuilder
//    FILENAME: GestureAdapter.java
//         IDE: IntelliJ IDEA
//      AUTHOR: Galen Rhodes
//        DATE: June 21, 2024
//
// Copyright © 2024 Project Galen. All rights reserved.
//
// Permission to use, copy, modify, and distribute this software for any purpose with or without fee is hereby granted, provided
// that the above copyright notice and this permission notice appear in all copies.
//
// THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED
// WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR
// CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT,
// NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
// ================================================================================================================================

import com.apple.eawt.event.GesturePhaseEvent;
import com.apple.eawt.event.GesturePhaseListener;
import com.apple.eawt.event.MagnificationEvent;
import com.apple.eawt.event.MagnificationListener;
import com.apple.eawt.event.RotationEvent;
import com.apple.eawt.event.RotationListener;
import com.apple.eawt.event.SwipeEvent;
import com.apple.eawt.event.SwipeListener;

public class GestureAdapter implements GesturePhaseListener, MagnificationListener, RotationListener, SwipeListener {

    public  void gestureBegan(GesturePhaseEvent arg0) {
        throw new UnsupportedOperationException();
    }

    public  void gestureEnded(GesturePhaseEvent arg0) {
        throw new UnsupportedOperationException();
    }

    public  void magnify(MagnificationEvent arg0) {
        throw new UnsupportedOperationException();
    }

    public  void swipedDown(SwipeEvent arg0) {
        throw new UnsupportedOperationException();
    }

    public  void swipedLeft(SwipeEvent arg0) {
        throw new UnsupportedOperationException();
    }

    public  void swipedRight(SwipeEvent arg0) {
        throw new UnsupportedOperationException();
    }

    public  void swipedUp(SwipeEvent arg0) {
        throw new UnsupportedOperationException();
    }

    public  void rotate(RotationEvent arg0) {
        throw new UnsupportedOperationException();
    }
}
