# CampusLife — COMPX202 Assignment One

Student ID: 2238916020  
Assignment: COMPX202/Y05853 Assignment One — Introduction to Android

## Overview

CampusLife is a companion Android app for University of Waikato students. It
showcases four student service areas — Facilities, Events, Clubs and Support —
with a responsive home screen and a detail screen for each area.

## Features

- Responsive portrait and landscape layouts (no hard-coded view sizes).
- Brand colours and a pressed-state button selector.
- A launcher icon generated from the CampusLife logo.
- Four category buttons with click feedback (Toast).
- An explicit `Intent` that passes the selected category index to `DetailActivity`.
- Detail content loaded from `arrays.xml` by index — no `if`/`switch` statements.

## Structure

- `MainActivity` — home screen, button click handlers, starts `DetailActivity`.
- `DetailActivity` — reads the category index from the Intent and populates the
  UI from the three string arrays in `res/values/arrays.xml`.
- `res/layout/activity_main.xml` — portrait home screen.
- `res/layout-land/activity_main.xml` — landscape home screen (single button row).
- `res/layout/activity_detail.xml` — detail screen.

## Build

Open the project in Android Studio (minimum SDK 24) and run on a device or
emulator, or build from the command line with `./gradlew assembleDebug`.
