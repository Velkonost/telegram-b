# telegram-b

React Native + Expo project scaffold.

## Stack

- React Native 0.74
- Expo SDK 51
- TypeScript
- Expo Router (file-based routing)
- React Navigation
- AsyncStorage
- EAS Build

## Project Structure

```
app/            # Expo Router file-based routing
  _layout.tsx   # Root Stack layout
  index.tsx     # Home screen
components/     # Reusable UI components
hooks/          # Custom React hooks
stores/         # State management
lib/            # Utilities and helpers
types/          # TypeScript type definitions
assets/         # Static assets (images, fonts)
```

## Getting Started

```bash
npm install
npx expo start
```

## Build

```bash
npx eas build --profile development
npx eas build --profile preview
npx eas build --profile production
```
