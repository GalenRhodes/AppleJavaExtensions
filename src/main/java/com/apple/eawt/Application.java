package com.apple.eawt;
// ================================================================================================================================
//     PROJECT: ProxyBuilder
//    FILENAME: Application.java
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

import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.Window;
import java.awt.desktop.AboutHandler;
import java.awt.desktop.OpenFilesHandler;
import java.awt.desktop.OpenURIHandler;
import java.awt.desktop.PreferencesHandler;
import java.awt.desktop.PrintFilesHandler;
import java.awt.desktop.QuitHandler;
import java.awt.desktop.QuitStrategy;
import java.awt.desktop.SystemEventListener;
import javax.swing.JMenuBar;

public class Application {

    public  void enableSuddenTermination() {
        throw new UnsupportedOperationException();
    }

    public  void disableSuddenTermination() {
        throw new UnsupportedOperationException();
    }

    public  void requestUserAttention(boolean arg0) {
        throw new UnsupportedOperationException();
    }

    public  void openHelpViewer() {
        throw new UnsupportedOperationException();
    }

    public  void setDockMenu(PopupMenu arg0) {
        throw new UnsupportedOperationException();
    }

    public  PopupMenu getDockMenu() {
        throw new UnsupportedOperationException();
    }

    public  void setDockIconImage(Image arg0) {
        throw new UnsupportedOperationException();
    }

    public  Image getDockIconImage() {
        throw new UnsupportedOperationException();
    }

    public  void setDockIconBadge(String arg0) {
        throw new UnsupportedOperationException();
    }

    public  void setDockIconProgress(int arg0) {
        throw new UnsupportedOperationException();
    }

    public  void setDefaultMenuBar(JMenuBar arg0) {
        throw new UnsupportedOperationException();
    }

    public  void addAppEventListener(SystemEventListener arg0) {
        throw new UnsupportedOperationException();
    }

    public  void removeAppEventListener(SystemEventListener arg0) {
        throw new UnsupportedOperationException();
    }

    public  void setAboutHandler(AboutHandler arg0) {
        throw new UnsupportedOperationException();
    }

    public  void setPreferencesHandler(PreferencesHandler arg0) {
        throw new UnsupportedOperationException();
    }

    public  void setOpenFileHandler(OpenFilesHandler arg0) {
        throw new UnsupportedOperationException();
    }

    public  void setPrintFileHandler(PrintFilesHandler arg0) {
        throw new UnsupportedOperationException();
    }

    public  void setOpenURIHandler(OpenURIHandler arg0) {
        throw new UnsupportedOperationException();
    }

    public  void setQuitHandler(QuitHandler arg0) {
        throw new UnsupportedOperationException();
    }

    public  void setQuitStrategy(QuitStrategy arg0) {
        throw new UnsupportedOperationException();
    }

    public  void requestForeground(boolean arg0) {
        throw new UnsupportedOperationException();
    }

    public  void requestToggleFullScreen(Window arg0) {
        throw new UnsupportedOperationException();
    }

    public static  Application getApplication() {
        throw new UnsupportedOperationException();
    }
}
