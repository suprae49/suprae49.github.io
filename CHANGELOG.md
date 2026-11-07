# Changelog

## VYRA Code Studio — Phone Productivity, Backup & PWA

- Added a language-aware phone quick-insert strip with VYRA, Python, and C templates; taps insert at the current cursor and preserve editor focus.
- Added versioned JSON project backup export/import for all language drafts, file names, active language, theme, and display preferences.
- Validates backup format, per-draft size, and imported filenames before restoring; rejects malformed or oversized backup files with a visible status message.
- Added installable web-app metadata, app icons, an install prompt for supported browsers, and an offline app-shell service worker for the IDE and How to Use guide.
- Expanded the guide with backup, phone quick-insert, install, and offline instructions.
- Added regression checks for quick-insert behavior, language switching of templates, backup payload shape, and guide sections.


## VYRA Code Studio — Mobile Dock & Editor Refinement

- Added a fixed, safe-area-aware phone dock for Editor, Run, Output, and Guide navigation.
- Added persistent editor font-size controls (12–20px) and a persistent word-wrap toggle.
- Fixed Shift+Tab so outdent works while the caret is inside a line, not only inside leading whitespace.
- Fixed selected-line indentation and comment toggling at a selection boundary that ends at the next line's start.
- Expanded the How to Use guide with phone dock, font-size, word-wrap, and draft-safety instructions.
- Extended UI smoke tests for the new controls and the indentation boundary cases.


## VYRA Code Studio — Mobile & Editor Refresh

- Reworked the workspace header into a compact brand row and a horizontally scrollable action toolbar on phones.
- Added a mobile Editor / Output view switcher; Run opens Output and selecting a file or demo returns to Editor.
- Added a phone-friendly editor layout with safe-area spacing, larger touch targets, readable editor text, compact line numbers, and wrapped output.
- Added Find and Replace with next-match navigation, one-match replacement, replace-all, and `Ctrl+F`.
- Added Auto / Dark / Light theme selection and remembered the preference in local browser storage.
- Added drag-and-drop opening for supported `.vy`, `.py`, `.c`, and `.h` source files.
- Improved draft reliability by flushing pending edits when changing language and on `pagehide` / `beforeunload`.
- Made Reset demo confirm before replacing non-demo source.
- Expanded `how-to.html` into a responsive guide covering the interface, phone layout, language syntax, compiler, shortcuts, errors, internals, and current limitations.
- Added UI smoke tests for language modes, generated C refresh, indentation, comments, Find/Replace, themes, and the mobile view switcher.

## Scope note

The language compiler remains VYRA v0.2. Python and C modes are editing/autocomplete modes; they do not have built-in browser execution runtimes.
